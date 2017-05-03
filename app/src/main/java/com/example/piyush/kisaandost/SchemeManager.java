package com.example.piyush.kisaandost;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.view.View;
import android.view.View.OnClickListener;

import java.io.File;

public class SchemeManager extends AppCompatActivity implements OnClickListener {
    ImageButton soil_button,seed_btton,irrigation_button,training_button,credit_button,insurance_button,protection_button,mechanization_button,marketing_button,integrated_button,horticulture_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scheme_manager);
        soil_button=(ImageButton)findViewById(R.id.soil_button);
        seed_btton=(ImageButton)findViewById(R.id.seed_button);
        irrigation_button=(ImageButton)findViewById(R.id.irrigation_button);
        training_button=(ImageButton)findViewById(R.id.training_button);
        credit_button=(ImageButton)findViewById(R.id.credit_button);
        insurance_button=(ImageButton)findViewById(R.id.insurance_button);
        protection_button=(ImageButton)findViewById(R.id.protection_button);
        mechanization_button=(ImageButton)findViewById(R.id.mechanization_button);
        marketing_button=(ImageButton)findViewById(R.id.marketing_button);
        integrated_button=(ImageButton)findViewById(R.id.integrated_button);
        horticulture_button=(ImageButton)findViewById(R.id.horticulture_button);

        soil_button.setOnClickListener(this);
        seed_btton.setOnClickListener(this);
        irrigation_button.setOnClickListener(this);
        training_button.setOnClickListener(this);
        credit_button.setOnClickListener(this);
        insurance_button.setOnClickListener(this);
        protection_button.setOnClickListener(this);
        mechanization_button.setOnClickListener(this);
        marketing_button.setOnClickListener(this);
        integrated_button.setOnClickListener(this);
        horticulture_button.setOnClickListener(this);
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
        if(v.getId()==R.id.soil_button){
            getScheme("soil");
        }
        else if(v.getId()==R.id.seed_button){
            getScheme("seed");
        }
        else if(v.getId()==R.id.irrigation_button){
            getScheme("irrigation");
        }
        else if(v.getId()==R.id.training_button){
            getScheme("training");
        }
        else if(v.getId()==R.id.credit_button){
            getScheme("credit");
        }
        else if(v.getId()==R.id.insurance_button){
            getScheme("insuarance");
        }
        else if(v.getId()==R.id.protection_button){
            getScheme("protection");
        }
        else if(v.getId()==R.id.mechanization_button){
            getScheme("mechanization");
        }
        else if(v.getId()==R.id.marketing_button){
            getScheme("marketing");
        }
        else if(v.getId()==R.id.integrated_button){
            getScheme("integrated");
        }
        else if(v.getId()==R.id.horticulture_button){
            getScheme("horticulture");
        }

    }
    public void getScheme(String soil2) {
        // TODO Auto-generated method stub
        Intent i=new Intent(this,DisplayManager.class);
        i.putExtra("dms", soil2);
        startActivity(i);
    }
}
