package com.example.piyush.kisaandost;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.StringTokenizer;

public class EquipmentDisplay extends AppCompatActivity {
    String dis;
    TextView head,discr,specs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipment_display);
        Intent i=getIntent();
        dis=i.getExtras().getString("ankita");
        head=(TextView)findViewById(R.id.heading);
        discr=(TextView)findViewById(R.id.discription);
        specs=(TextView)findViewById(R.id.specs);
        new doit().execute();
    }
    public class doit extends AsyncTask<Void, Void, Void> {
        String disc,disc1="spec",para1;
        @Override
        protected Void doInBackground(Void... params) {
            // TODO Auto-generated method stub
            try {

                Document doc = Jsoup.connect(dis).get();
                //Element paragraphs = doc.select("p").get(0);
                //para1=paragraphs.text();

                disc=doc.title();
                Elements table=doc.select("table");
                Elements rows=table.select("tr");
                for(int i=0;i<rows.size();i++){
                    Element row=rows.get(i);
                    Elements cols=row.select("td");

                   disc1=disc1.concat(cols.get(0).text());
                    disc1=disc1.concat("=>");
                    disc1=disc1.concat(cols.get(1).text());
                    disc1=disc1.concat("\n");
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                Log.d("TAG", e.getMessage().toString());
                e.printStackTrace();
            }
            return null;
        }
        @Override
        protected void onPostExecute(Void result) {
            // TODO Auto-generated method stub
            super.onPostExecute(result);
            StringTokenizer st = new StringTokenizer(disc,"|");
            disc=st.nextToken();
            head.setText(disc);
            discr.setText(para1);
            specs.setText(disc1);
        }
    }
}
