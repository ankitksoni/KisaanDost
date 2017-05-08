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
    ImageButton bucket_scraper;
    ImageButton cultivator;
    ImageButton disc_harrow;
    ImageButton disc_plough;
    ImageButton potato_planter;
    ImageButton rice_planter;
    ImageButton fert_drill;
    ImageButton rice_transplanter;
    ImageButton boom_sprayer;
    ImageButton fert_spreader;
    ImageButton backpack_harvester;
    ImageButton sickle_sword;
    ImageButton thresher;
    ImageButton harvester;
    ImageButton baler;
    ImageButton mulcher;
    ImageButton shredder;
    ImageButton scrub_master;
    ImageButton straw_reaper;
    ImageButton trolley;
    ImageButton conveyar_reaper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipment_manager);

        bucket_scraper=(ImageButton)findViewById(R.id.em_bucket_scrapper);
        bucket_scraper.setOnClickListener(this);

        cultivator=(ImageButton)findViewById(R.id.em_cultivator);
        cultivator.setOnClickListener(this);

        disc_harrow=(ImageButton)findViewById(R.id.em_disc_harrow);
        disc_harrow.setOnClickListener(this);

        disc_plough=(ImageButton)findViewById(R.id.em_disc_plough);
        disc_plough.setOnClickListener(this);

        potato_planter=(ImageButton)findViewById(R.id.em_potato_planter);
        potato_planter.setOnClickListener(this);

        rice_planter=(ImageButton)findViewById(R.id.em_rice_planter);
        rice_planter.setOnClickListener(this);

        fert_drill=(ImageButton)findViewById(R.id.em_fert_drill);
        fert_drill.setOnClickListener(this);

        rice_transplanter=(ImageButton)findViewById(R.id.em_rice_transplanter);
        rice_transplanter.setOnClickListener(this);

        boom_sprayer=(ImageButton)findViewById(R.id.em_boom_sprayer);
        boom_sprayer.setOnClickListener(this);

        fert_spreader=(ImageButton)findViewById(R.id.em_fert_spreader);
        fert_spreader.setOnClickListener(this);

        backpack_harvester=(ImageButton)findViewById(R.id.em_backpack_harvester);
        backpack_harvester.setOnClickListener(this);

        sickle_sword=(ImageButton)findViewById(R.id.em_sickle_sword);
        sickle_sword.setOnClickListener(this);

        thresher=(ImageButton)findViewById(R.id.em_thresher);
        thresher.setOnClickListener(this);

        harvester=(ImageButton)findViewById(R.id.em_harvester);
        harvester.setOnClickListener(this);

        baler=(ImageButton)findViewById(R.id.em_baler);
        baler.setOnClickListener(this);

        mulcher=(ImageButton)findViewById(R.id.em_mulcher);
        mulcher.setOnClickListener(this);

        shredder=(ImageButton)findViewById(R.id.em_shredder);
        shredder.setOnClickListener(this);

        scrub_master=(ImageButton)findViewById(R.id.em_scrub_master);
        scrub_master.setOnClickListener(this);

        straw_reaper=(ImageButton)findViewById(R.id.em_straw_reaper);
        straw_reaper.setOnClickListener(this);

        trolley=(ImageButton)findViewById(R.id.em_trolley);
        trolley.setOnClickListener(this);

        conveyar_reaper=(ImageButton)findViewById(R.id.em_conveyar_reaper);
        conveyar_reaper.setOnClickListener(this);

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
        if(v.getId()==R.id.em_bucket_scrapper){
            Intent i=new Intent(this,EquipmentDisplay.class);
            i.putExtra("ankita","https://www.mahindratractor.com/tractor-mechanisation-solutions/implements/bucket-scrapper");
            i.putExtra("ename","bucket_scrapper");
            startActivity(i);
        }
        else if(v.getId()==R.id.em_cultivator){
            Intent i=new Intent(this,EquipmentDisplay.class);
            i.putExtra("ankita","https://www.mahindratractor.com/tractor-mechanisation-solutions/implements/cultivator");
            i.putExtra("ename","cultivator");
            startActivity(i);
        }
        else if(v.getId()==R.id.em_disc_harrow){
            Intent i=new Intent(this,EquipmentDisplay.class);
            i.putExtra("ankita","https://www.mahindratractor.com/tractor-mechanisation-solutions/implements/disc-harrow");
            i.putExtra("ename","disc_harrow");
            startActivity(i);
        }
        else if(v.getId()==R.id.em_disc_plough){
            Intent i=new Intent(this,EquipmentDisplay.class);
            i.putExtra("ankita","https://www.mahindratractor.com/tractor-mechanisation-solutions/implements/disc-plough");
            i.putExtra("ename","disc_plough");
            startActivity(i);
        }
        else if(v.getId()==R.id.em_potato_planter){
            Intent i=new Intent(this,EquipmentDisplay.class);
            i.putExtra("ankita","https://www.mahindratractor.com/tractor-mechanisation-solutions/implements/potato-planter");
            i.putExtra("ename","potato_planter");
            startActivity(i);
        }
        else if(v.getId()==R.id.em_rice_planter){
            Intent i=new Intent(this,EquipmentDisplay.class);
            i.putExtra("ankita","https://www.mahindratractor.com/tractor-mechanisation-solutions/implements/riding-type-rice-transplanter");
            i.putExtra("ename","rice_planter");
            startActivity(i);
        }
        else if(v.getId()==R.id.em_fert_drill){
            Intent i=new Intent(this,EquipmentDisplay.class);
            i.putExtra("ankita","https://www.mahindratractor.com/tractor-mechanisation-solutions/implements/seed-cum-fertilizer-drill");
            i.putExtra("ename","fert_drill");
            startActivity(i);
        }
        else if(v.getId()==R.id.em_rice_transplanter){
            Intent i=new Intent(this,EquipmentDisplay.class);
            i.putExtra("ankita","https://www.mahindratractor.com/tractor-mechanisation-solutions/implements/walk-behind-rice-transplanter");
            i.putExtra("ename","rice_transplanter");
            startActivity(i);
        }
        else if(v.getId()==R.id.em_boom_sprayer){
            Intent i=new Intent(this,EquipmentDisplay.class);
            i.putExtra("ankita","https://www.mahindratractor.com/tractor-mechanisation-solutions/implements/boom-sprayer");
            i.putExtra("ename","boom_sprayer");
            startActivity(i);
        }
        else if(v.getId()==R.id.em_fert_spreader){
            Intent i=new Intent(this,EquipmentDisplay.class);
            i.putExtra("ankita","https://www.mahindratractor.com/tractor-mechanisation-solutions/implements/fertilizer-spreader");
            i.putExtra("ename","fert_spreader");
            startActivity(i);
        }
        else if(v.getId()==R.id.em_backpack_harvester){
            Intent i=new Intent(this,EquipmentDisplay.class);
            i.putExtra("ankita","https://www.mahindratractor.com/tractor-mechanisation-solutions/implements/backpack-harvester");
            i.putExtra("ename","backpack_harvester");
            startActivity(i);
        }
        else if(v.getId()==R.id.em_sickle_sword){
            Intent i=new Intent(this,EquipmentDisplay.class);
            i.putExtra("ankita","https://www.mahindratractor.com/tractor-mechanisation-solutions/implements/sickle-sword");
            i.putExtra("ename","sickle_sword");
            startActivity(i);
        }
        else if(v.getId()==R.id.em_thresher){
            Intent i=new Intent(this,EquipmentDisplay.class);
            i.putExtra("ankita","https://www.mahindratractor.com/tractor-mechanisation-solutions/implements/thresher");
            i.putExtra("ename","thresher");
            startActivity(i);
        }
        else if(v.getId()==R.id.em_harvester){
            Intent i=new Intent(this,EquipmentDisplay.class);
            i.putExtra("ankita","https://www.mahindratractor.com/tractor-mechanisation-solutions/implements/tractor-mounted-combine-harvester");
            i.putExtra("ename","harvester");
            startActivity(i);
        }
        else if(v.getId()==R.id.em_baler){
            Intent i=new Intent(this,EquipmentDisplay.class);
            i.putExtra("ankita","https://www.mahindratractor.com/tractor-mechanisation-solutions/implements/baler");
            i.putExtra("ename","baler");
            startActivity(i);
        }
        else if(v.getId()==R.id.em_mulcher){
            Intent i=new Intent(this,EquipmentDisplay.class);
            i.putExtra("ankita","https://www.mahindratractor.com/tractor-mechanisation-solutions/implements/mulcher");
            i.putExtra("ename","mulcher");
            startActivity(i);
        }
        else if(v.getId()==R.id.em_shredder){
            Intent i=new Intent(this,EquipmentDisplay.class);
            i.putExtra("ankita","https://www.mahindratractor.com/tractor-mechanisation-solutions/implements/shredder");
            i.putExtra("ename","shredder");
            startActivity(i);
        }
        else if(v.getId()==R.id.em_scrub_master){
            Intent i=new Intent(this,EquipmentDisplay.class);
            i.putExtra("ankita","https://www.mahindratractor.com/tractor-mechanisation-solutions/implements/scrub-master");
            i.putExtra("ename","scrub_master");
            startActivity(i);
        }
        else if(v.getId()==R.id.em_straw_reaper){
            Intent i=new Intent(this,EquipmentDisplay.class);
            i.putExtra("ankita","https://www.mahindratractor.com/tractor-mechanisation-solutions/implements/straw-reaper");
            i.putExtra("ename","straw_reaper");
            startActivity(i);
        }
        else if(v.getId()==R.id.em_trolley){
            Intent i=new Intent(this,EquipmentDisplay.class);
            i.putExtra("ankita","https://www.mahindratractor.com/tractor-mechanisation-solutions/implements/trolley");
            i.putExtra("ename","trolley");
            startActivity(i);
        }
        else if(v.getId()==R.id.em_conveyar_reaper){
            Intent i=new Intent(this,EquipmentDisplay.class);
            i.putExtra("ankita","https://www.mahindratractor.com/tractor-mechanisation-solutions/implements/vertical-conveyar-reaper");
            i.putExtra("ename","conveyar_reaper");
            startActivity(i);
        }

    }
}
