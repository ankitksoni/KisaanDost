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
    String dis,name;
    TextView head,discr,specs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipment_display);
        Intent i=getIntent();
        dis=i.getExtras().getString("ankita");
        name=i.getExtras().getString("ename");

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
            if(name.equalsIgnoreCase("bucket_scrapper")){
                discr.setText(R.string.desc_bucket_scrapper);
            }
            else if(name.equalsIgnoreCase("cultivator")){
                discr.setText(R.string.desc_cultivator);
            }
            else if(name.equalsIgnoreCase("disc_harrow")){
                discr.setText(R.string.desc_disc_harrow);
            }
            else if(name.equalsIgnoreCase("disc_plough")){
                discr.setText(R.string.desc_disc_plough);
            }
            else if(name.equalsIgnoreCase("potato_planter")){
                discr.setText(R.string.desc_potato_planter);
            }
            else if(name.equalsIgnoreCase("rice_planter")){
                discr.setText(R.string.desc_rice_planter);
            }
            else if(name.equalsIgnoreCase("fert_drill")){
                discr.setText(R.string.desc_fert_drill);
            }
            else if(name.equalsIgnoreCase("rice_transplanter")){
                discr.setText(R.string.desc_walk_behind_rice_transplanter);
            }
            else if(name.equalsIgnoreCase("boom_sprayer")){
                discr.setText(R.string.desc_boom_sprayer);
            }
            else if(name.equalsIgnoreCase("fert_sprayer")){
                discr.setText(R.string.desc_fert_sprayer);
            }
            else if(name.equalsIgnoreCase("backpack_harvester")){
                discr.setText(R.string.desc_backpack_harvester);
            }
            else if(name.equalsIgnoreCase("sickle_sword")){
                discr.setText(R.string.desc_sickle_sword);
            }
            else if(name.equalsIgnoreCase("thresher")){
                discr.setText(R.string.desc_thresher);
            }
            else if(name.equalsIgnoreCase("harvester")){
                discr.setText(R.string.desc_harvester);
            }
            else if(name.equalsIgnoreCase("baler")){
                discr.setText(R.string.desc_baler);
            }
            else if(name.equalsIgnoreCase("mulcher")){
                discr.setText(R.string.desc_mulcher);
            }
            else if(name.equalsIgnoreCase("shredder")){
                discr.setText(R.string.desc_shredder);
            }
            else if(name.equalsIgnoreCase("scrub_master")){
                discr.setText(R.string.desc_scrub_master);
            }
            else if(name.equalsIgnoreCase("straw_reaper")){
                discr.setText(R.string.desc_straw_reaper);
            }
            else if(name.equalsIgnoreCase("trolley")){
                discr.setText(R.string.desc_trolley);
            }
            else if(name.equalsIgnoreCase("conveyar_reaper")){
                discr.setText(R.string.desc_conveyar_reaper);
            }
            specs.setText(disc1);
        }
    }
}