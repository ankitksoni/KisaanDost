package com.example.piyush.kisaandost;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import java.io.File;

public class DisplayManager extends AppCompatActivity implements OnClickListener{
    TextView head,whatToDo,documentRequired,whomToContact,assistanceDetail,provision,category,component,sno;
    TextView assistanceDetail1,provision1,category1,component1,sno1,assistanceDetail2,provision2,category2,component2,sno2;
    String[] display;
    String Text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_manager);
        Intent i=getIntent();
        Text=i.getExtras().getString("dms");

        if(Text.equalsIgnoreCase("Soil")){
            display=getResources().getStringArray(R.array.soil);
        }
        else if(Text.equalsIgnoreCase("seed")){
            display=getResources().getStringArray(R.array.seeds);
        }
        else if(Text.equalsIgnoreCase("irrigation")){
            display=getResources().getStringArray(R.array.Irrigation);
        }
        else if(Text.equalsIgnoreCase("training")){
            display=getResources().getStringArray(R.array.Training);
        }
        else if(Text.equalsIgnoreCase("credit")){
            display=getResources().getStringArray(R.array.Credit);
        }
        else if(Text.equalsIgnoreCase("insuarance")){
            display=getResources().getStringArray(R.array.Insurance);
        }else if(Text.equalsIgnoreCase("protection")){
            display=getResources().getStringArray(R.array.Protection);
        }else if(Text.equalsIgnoreCase("mechanization")){
            display=getResources().getStringArray(R.array.Mechanization);
        }else if(Text.equalsIgnoreCase("marketing")){
            display=getResources().getStringArray(R.array.Marketing);
        }else if(Text.equalsIgnoreCase("integrated")){
            display=getResources().getStringArray(R.array.Farming);
        }else if(Text.equalsIgnoreCase("horticulture")){
            display=getResources().getStringArray(R.array.Horticulture);
        }

        head=(TextView)findViewById(R.id.dm_textView1);
        whatToDo=(TextView)findViewById(R.id.dm_textView2);
        documentRequired=(TextView)findViewById(R.id.dm_textView3);
        whomToContact=(TextView)findViewById(R.id.dm_textView4);
        sno=(TextView)findViewById(R.id.sno1);
        assistanceDetail=(TextView)findViewById(R.id.assiatance1);
        provision=(TextView)findViewById(R.id.provision1);
        category=(TextView)findViewById(R.id.Category1);
        component=(TextView)findViewById(R.id.Scheme_Component1);

        sno1=(TextView)findViewById(R.id.sno2);
        assistanceDetail1=(TextView)findViewById(R.id.assiatance2);
        provision1=(TextView)findViewById(R.id.provision2);
        category1=(TextView)findViewById(R.id.Category2);
        component1=(TextView)findViewById(R.id.Scheme_Component2);

        sno2=(TextView)findViewById(R.id.sno3);
        assistanceDetail2=(TextView)findViewById(R.id.assiatance3);
        provision2=(TextView)findViewById(R.id.provision3);
        category2=(TextView)findViewById(R.id.Category3);
        component2=(TextView)findViewById(R.id.Scheme_Component3);

        head.setText(display[0]);
        whatToDo.setText(display[1]);
        documentRequired.setText(display[2]);
        whomToContact.setText(display[3]);
        sno.setText("1.");
        assistanceDetail.setText(display[4]);
        provision.setText(display[5]);
        category.setText(display[6]);
        component.setText(display[7]);

        sno1.setText("2.");
        assistanceDetail1.setText(display[8]);
        provision1.setText(display[9]);
        category1.setText(display[10]);
        component1.setText(display[11]);

        sno2.setText("3.");
        assistanceDetail2.setText(display[12]);
        provision2.setText(display[13]);
        category2.setText(display[14]);
        component2.setText(display[15]);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.View_preference){
            File dir=getFilesDir();
            File file=new File(dir,"lan.txt");
            file.delete();
            Intent i=new Intent(this,MainActivity.class);
            startActivity(i);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

    }
}
