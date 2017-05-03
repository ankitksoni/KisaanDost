package com.example.piyush.kisaandost;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import java.io.*;
import java.io.FileInputStream;
import java.util.Locale;

public class FarmerManager extends AppCompatActivity implements OnClickListener{
    Button market_price,govt_scheme,farming_tech,equipments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        File path=getFilesDir();
        File file=new File(path,"lan.txt");
        int length = (int) file.length();

        byte[] bytes = new byte[length];


        try {
            FileInputStream in;
            in = new FileInputStream(file);
            in.read(bytes);
            in.close();
        }
        catch(IOException e){

        }
        String text = new String(bytes);
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
        lanConverter(text);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmer_manager);
        market_price=(Button)findViewById(R.id.button1);
        govt_scheme=(Button)findViewById(R.id.button2);
        equipments=(Button)findViewById(R.id.button3);
        farming_tech=(Button)findViewById(R.id.button4);
        market_price.setOnClickListener(this);
        govt_scheme.setOnClickListener(this);
        farming_tech.setOnClickListener(this);
        equipments.setOnClickListener(this);
    }
    @Override
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

    public void lanConverter(String text) {
        if(text.equals("Hindi")){
            Locale locale3 = new Locale("hi");
            Locale.setDefault(locale3);
            Configuration config3 = new Configuration();

            config3.locale = locale3;
            getBaseContext().getResources().updateConfiguration(config3, getBaseContext().getResources().getDisplayMetrics());


        }
        else if(text.equals("English")){
            Locale locale3 = new Locale("en");
            Locale.setDefault(locale3);
            Configuration config3 = new Configuration();
            config3.locale = locale3;
            getBaseContext().getResources().updateConfiguration(config3, getBaseContext().getResources().getDisplayMetrics());
        }
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button1){
            viewMarketprice();
        }
        else if(v.getId()==R.id.button2){
            getGovtschemes();
        }
        else if(v.getId()==R.id.button3){
            getEquipments();
        }
        else if(v.getId()==R.id.button4){
            getFarmingTechniques();
        }

    }
    public void getFarmingTechniques() {
        // TODO Auto-generated method stub

    }

    public void getEquipments() {
        // TODO Auto-generated method stub
       Intent e=new Intent(this,EquipmentManager.class);
        startActivity(e);
    }

    public void getGovtschemes() {
        // TODO Auto-generated method stub
       Intent i=new Intent(this,SchemeManager.class);
        startActivity(i);
    }


    public void viewMarketprice() {
        // TODO Auto-generated method stub
      Intent i=new Intent(this,MarketPrice.class);
      startActivity(i);
    }
}
