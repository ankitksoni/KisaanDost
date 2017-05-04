package com.example.kisaandost;





import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class FarmingTechniqueManager extends Activity implements OnItemSelectedListener,OnClickListener{
	Spinner ftm_spinner;
	TextView crop1,crop2,crop3,crop4,tech1,tech2,tech3,tech4,tech5,tech6,tech7,tech8;
	TextView tech9,tech10,tech11,tech12,tech13;
	String[] show;
	String item;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_farming_technique_manager);
		String[] display=getResources().getStringArray(R.array.types);
		ftm_spinner=(Spinner)findViewById(R.id.ft_spinner1);
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, display);
			dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
			ftm_spinner.setAdapter(dataAdapter);
			ftm_spinner.setOnItemSelectedListener(this);
			crop1=(TextView)findViewById(R.id.ft_cropname1);
			crop2=(TextView)findViewById(R.id.ft_cropname2);
			crop3=(TextView)findViewById(R.id.ft_cropname3);
			crop4=(TextView)findViewById(R.id.ft_cropname4);
			tech1=(TextView)findViewById(R.id.ft_tech1);
			tech2=(TextView)findViewById(R.id.ft_tech2);
			tech3=(TextView)findViewById(R.id.ft_tech3);
			tech4=(TextView)findViewById(R.id.ft_tech4);
			tech5=(TextView)findViewById(R.id.ft_tech5);
			tech6=(TextView)findViewById(R.id.ft_tech6);
			tech7=(TextView)findViewById(R.id.ft_tech7);
			tech8=(TextView)findViewById(R.id.ft_tech8);
			tech9=(TextView)findViewById(R.id.ft_tech9);
			tech10=(TextView)findViewById(R.id.ft_tech10);
			tech11=(TextView)findViewById(R.id.ft_tech11);
			tech12=(TextView)findViewById(R.id.ft_tech12);
			tech13=(TextView)findViewById(R.id.ft_tech13);
			tech1.setOnClickListener(this);
			tech2.setOnClickListener(this);
			tech3.setOnClickListener(this);
			tech4.setOnClickListener(this);
			tech5.setOnClickListener(this);
			tech5.setOnClickListener(this);
			tech6.setOnClickListener(this);
			tech7.setOnClickListener(this);
			tech8.setOnClickListener(this);
			tech9.setOnClickListener(this);
			tech10.setOnClickListener(this);
			tech11.setOnClickListener(this);
			tech12.setOnClickListener(this);
			tech13.setOnClickListener(this);
			
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.farming_technique_manager, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		 item=parent.getItemAtPosition(position).toString();
		if(item.equalsIgnoreCase("food")||item.equalsIgnoreCase("भोजन"))
		{
			show=getResources().getStringArray(R.array.food);
		}
		else if(item.equalsIgnoreCase("Vegetable")||item.equalsIgnoreCase("सबजी"))
		{
			show=getResources().getStringArray(R.array.vegetable);
		}
		else if(item.equalsIgnoreCase("CashFood")||item.equalsIgnoreCase("कैशफ़ूड"))
		{
			show=getResources().getStringArray(R.array.cashfood);
		}
		else if(item.equalsIgnoreCase("Fruit")||item.equalsIgnoreCase("फल"))
		{
			show=getResources().getStringArray(R.array.fruit);
		}
		
		crop1.setText(show[0]);
		tech1.setText(show[1]);
		tech2.setText(show[2]);
		tech3.setText(show[3]);
		tech4.setText(show[4]);
		crop2.setText(show[5]);
		tech5.setText(show[6]);
		tech6.setText(show[7]);
		tech7.setText(show[8]);
		tech8.setText(show[9]);
		crop3.setText(show[10]);
		tech9.setText(show[11]);
		tech10.setText(show[12]);
		tech11.setText(show[13]);
		tech12.setText(show[14]);
		crop4.setText(show[15]);
		tech13.setText(show[16]);
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

    if(item.equalsIgnoreCase("food")||item.equalsIgnoreCase("भोजन")){
    	
    
		if(v.getId()==R.id.ft_tech1){
		Intent i=new Intent(this,DisplayTechnique.class);
		i.putExtra("asd","Broadcasting_method");
		startActivity(i);
	}
		else if(v.getId()==R.id.ft_tech2){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","Drilling_method");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech3){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","Transplantation_method");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech4){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","Japanese_method");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech5){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","Raised_bed");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech6){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","Zero_till");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech7){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","Furrow_planting");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech8){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","Transplanting");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech9){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","Field_preparation");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech10){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","Seed_rate");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech11){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","Spacing");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech12){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","Irrigations");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech13){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","General_Method");
			startActivity(i);
		}
	}

    else if(item.equalsIgnoreCase("vegetable")||item.equalsIgnoreCase("सबजी")){
    	
    
		if(v.getId()==R.id.ft_tech1){
		Intent i=new Intent(this,DisplayTechnique.class);
		i.putExtra("asd","Hilled_Rows");
		startActivity(i);
	}
		else if(v.getId()==R.id.ft_tech2){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","Straw_Mulch");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech3){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","Raise_Bed");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech4){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","Grow_Bag");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech5){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","Sets");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech6){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","Transplants");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech7){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","Seeds");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.ft_tech9){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","Trench_Planting");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech10){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","Vertical_Planting");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.ft_tech13){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","General");
			startActivity(i);
		}
	}
    if(item.equalsIgnoreCase("CashFood")||item.equalsIgnoreCase("कैशफ़ूड")){
    	
        
		if(v.getId()==R.id.ft_tech1){
		Intent i=new Intent(this,DisplayTechnique.class);
		i.putExtra("asd","jute_seed");
		startActivity(i);
	}
		else if(v.getId()==R.id.ft_tech2){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","weeding_manuring");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech3){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","pest_control");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech4){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","retting");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech5){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","cotton_transplanting");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech6){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","cotton_mulcing");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech7){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","cotton_training");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech8){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","density");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech9){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","Budwood");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech10){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","Cash_seeding");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech11){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","Mulcing_Pruning");
			startActivity(i);
		}
		
		else if(v.getId()==R.id.ft_tech13){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","General_Technique");
			startActivity(i);
		}
	}
    if(item.equalsIgnoreCase("Fruit")||item.equalsIgnoreCase("फल"))
{
    	
        
		if(v.getId()==R.id.ft_tech1){
		Intent i=new Intent(this,DisplayTechnique.class);
		i.putExtra("asd","Vegetative_Method");
		startActivity(i);
	}
		else if(v.getId()==R.id.ft_tech2){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","Tissue_Culture");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech3){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","Pit_Method");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech4){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","Furrow_Method");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech5){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","fruit_Weather");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech6){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","fruit_soil");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech7){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","fruit_water");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech8){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","fruit_pruning");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech9){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","apple_planting");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech10){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","apple_soil");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech11){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","apple_harvest");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech12){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","apple_pests");
			startActivity(i);
		}
		else if(v.getId()==R.id.ft_tech13){
			Intent i=new Intent(this,DisplayTechnique.class);
			i.putExtra("asd","General_Methods");
			startActivity(i);
		}
	}
}
}