package com.example.piyush.kisaandost;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

import java.io.File;

public class EquipmentManager extends AppCompatActivity implements OnClickListener {
    ImageButton bucket;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipment_manager);
        bucket=(ImageButton)findViewById(R.id.em_bucket_scrapper);
        bucket.setOnClickListener(this);
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
       Intent i=new Intent(this,EquipmentDisplay.class);
        i.putExtra("ankita","https://www.mahindratractor.com/tractor-mechanisation-solutions/implements/bucket-scrapper");
        startActivity(i);
    }
}
