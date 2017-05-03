package com.example.piyush.kisaandost;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    String[] str={"English","Hindi"};
    Spinner s;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String path = getBaseContext().getFilesDir().getAbsolutePath() + "/lan.txt";
        File file=new File(path);
        if(file.exists()){
            Intent i=new Intent(this,FarmerManager.class);
            startActivity(i);
            finish();

        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s=(Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, str);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(dataAdapter);
        next=(Button)findViewById(R.id.next);
        next.setOnClickListener(this);
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
            Intent i=new Intent(this,MainActivity.class);
            startActivity(i);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        String text = s.getSelectedItem().toString();
        File path=getFilesDir();
        File file = new File(path, "lan.txt");

        try {
            FileOutputStream stream = new FileOutputStream(file);
            stream.write(text.getBytes());
            stream.close();
        }
        catch(IOException e){

        }

        Intent i=new Intent(this,FarmerManager.class);
        startActivity(i);
    }


}
