package com.example.kisaandost;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class DisplayTechnique extends Activity {

	TextView t1,t2,t3;
	String[] display;
	String[] display1;
	String[] display2;
	String[] display3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_technique);
		Intent i=getIntent();
		String Text=i.getExtras().getString("asd");
		t1=(TextView)findViewById(R.id.dt_t1);
		t2=(TextView)findViewById(R.id.dt_t2);
		t3=(TextView)findViewById(R.id.dt_t3);
		t2.setText(R.string.description);
		display=getResources().getStringArray(R.array.food);
		display1=getResources().getStringArray(R.array.vegetable);
		display2=getResources().getStringArray(R.array.cashfood);
		display3=getResources().getStringArray(R.array.fruit);
		if(Text.equalsIgnoreCase("Broadcasting_method")){
			t1.setText(display[1]);
			t3.setText(R.string.Broadcasting_method);
		}
		else if(Text.equalsIgnoreCase("Drilling_method")){
			t1.setText(display[2]);
			t3.setText(R.string.Drilling_method);
		}
		else if(Text.equalsIgnoreCase("Transplantation_method")){
			t1.setText(display[3]);
			t3.setText(R.string.Transplantation_method);
		}
		else if(Text.equalsIgnoreCase("Japanese_method")){
			t1.setText(display[4]);
			t3.setText(R.string.Japanese_method);
		}
		else if(Text.equalsIgnoreCase("Raised_bed")){
			t1.setText(display[6]);
			t3.setText(R.string.Raised_bed);
		}
		else if(Text.equalsIgnoreCase("Zero_till")){
			t1.setText(display[7]);
			t3.setText(R.string.Zero_till);
		}
		else if(Text.equalsIgnoreCase("Furrow_planting")){
			t1.setText(display[8]);
			t3.setText(R.string.Furrow_planting);
		}
		else if(Text.equalsIgnoreCase("Transplanting")){
			t1.setText(display[9]);
			t3.setText(R.string.Transplanting);
		}
		else if(Text.equalsIgnoreCase("Field_preparation")){
			t1.setText(display[11]);
			t3.setText(R.string.Field_preparation);
		}
		else if(Text.equalsIgnoreCase("Seed_rate")){
			t1.setText(display[12]);
			t3.setText(R.string.Seed_rate);
		}
		else if(Text.equalsIgnoreCase("Spacing")){
			t1.setText(display[13]);
			t3.setText(R.string.Spacing);
		}
		else if(Text.equalsIgnoreCase("Irrigations")){
			t1.setText(display[14]);
			t3.setText(R.string.Irrigations);
		}
		else if(Text.equalsIgnoreCase("General_Method")){
			t1.setText(display[16]);
			t3.setText(R.string.General_Method);
		}
		else if(Text.equalsIgnoreCase("Hilled_Rows")){
			t1.setText(display1[1]);
			t3.setText(R.string.Hilled_Rows);
		}
		else if(Text.equalsIgnoreCase("Straw_Mulch")){
			t1.setText(display1[2]);
			t3.setText(R.string.Straw_Mulch);
		}
		else if(Text.equalsIgnoreCase("Raise_Bed")){
			t1.setText(display1[3]);
			t3.setText(R.string.Raise_Bed);
		}
		else if(Text.equalsIgnoreCase("Grow_Bag")){
			t1.setText(display1[4]);
			t3.setText(R.string.Grow_Bag);
		}
		else if(Text.equalsIgnoreCase("Sets")){
			t1.setText(display1[6]);
			t3.setText(R.string.Sets);
		}
		else if(Text.equalsIgnoreCase("Transplants")){
			t1.setText(display1[7]);
			t3.setText(R.string.Transplants);
		}
		else if(Text.equalsIgnoreCase("Seeds")){
			t1.setText(display1[8]);
			t3.setText(R.string.Seeds);
		}
		else if(Text.equalsIgnoreCase("Trench_Planting")){
			t1.setText(display1[11]);
			t3.setText(R.string.Trench_Planting);
		}
		else if(Text.equalsIgnoreCase("Vertical_Planting")){
			t1.setText(display1[12]);
			t3.setText(R.string.Vertical_Planting);
		}
		else if(Text.equalsIgnoreCase("General")){
			t1.setText(display1[16]);
			t3.setText(R.string.General);
		}
		else if(Text.equalsIgnoreCase("jute_seed")){
			t1.setText(display2[1]);
			t3.setText(R.string.jute_seed);
		}
		else if(Text.equalsIgnoreCase("weeding_manuring")){
			t1.setText(display2[2]);
			t3.setText(R.string.weeding_manuring);
		}
		else if(Text.equalsIgnoreCase("pest_control")){
			t1.setText(display2[3]);
			t3.setText(R.string.pest_control);
		}
		else if(Text.equalsIgnoreCase("retting")){
			t1.setText(display2[4]);
			t3.setText(R.string.retting);
		}
		else if(Text.equalsIgnoreCase("cotton_transplanting")){
			t1.setText(display2[6]);
			t3.setText(R.string.cotton_transplanting);
		}
		else if(Text.equalsIgnoreCase("cotton_mulcing")){
			t1.setText(display2[7]);
			t3.setText(R.string.cotton_mulcing);
		}
		else if(Text.equalsIgnoreCase("cotton_training")){
			t1.setText(display2[8]);
			t3.setText(R.string.cotton_training);
		}
		else if(Text.equalsIgnoreCase("density")){
			t1.setText(display2[9]);
			t3.setText(R.string.density);
		}
		else if(Text.equalsIgnoreCase("Budwood")){
			t1.setText(display2[11]);
			t3.setText(R.string.Budwood);
		}
		else if(Text.equalsIgnoreCase("Cash_seeding")){
			t1.setText(display2[12]);
			t3.setText(R.string.Cash_seeding);
		}
		else if(Text.equalsIgnoreCase("Mulcing_Pruning")){
			t1.setText(display2[13]);
			t3.setText(R.string.Mulcing_Pruning);
		}
		else if(Text.equalsIgnoreCase("General_Technique")){
			t1.setText(display2[16]);
			t3.setText(R.string.General_Technique);
		}
		else if(Text.equalsIgnoreCase("Vegetative_Method")){
			t1.setText(display3[1]);
			t3.setText(R.string.Vegetative_Method);
		}
		else if(Text.equalsIgnoreCase("Tissue_Culture")){
			t1.setText(display3[2]);
			t3.setText(R.string.Tissue_Culture);
		}
		else if(Text.equalsIgnoreCase("Pit_Method")){
			t1.setText(display3[3]);
			t3.setText(R.string.Pit_Method);
		}
		else if(Text.equalsIgnoreCase("Furrow_Method")){
			t1.setText(display3[4]);
			t3.setText(R.string.Furrow_Method);
		}
		else if(Text.equalsIgnoreCase("fruit_Weather")){
			t1.setText(display3[6]);
			t3.setText(R.string.fruit_Weather);
		}
		else if(Text.equalsIgnoreCase("fruit_soil")){
			t1.setText(display3[7]);
			t3.setText(R.string.fruit_soil);
		}
		else if(Text.equalsIgnoreCase("fruit_water")){
			t1.setText(display3[8]);
			t3.setText(R.string.fruit_water);
		}
		else if(Text.equalsIgnoreCase("fruit_pruning")){
			t1.setText(display3[9]);
			t3.setText(R.string.fruit_pruning);
		}
		else if(Text.equalsIgnoreCase("apple_planting")){
			t1.setText(display3[11]);
			t3.setText(R.string.apple_planting);
		}
		else if(Text.equalsIgnoreCase("apple_soil")){
			t1.setText(display3[12]);
			t3.setText(R.string.apple_soil);s
		else if(Text.equalsIgnoreCase("apple_harvest")){
			t1.setText(display3[13]);
			t3.setText(R.string.apple_harvest);
		}
		else if(Text.equalsIgnoreCase("apple_pests")){
			t1.setText(display3[14]);
			t3.setText(R.string.apple_pests);
		}
		
		else if(Text.equalsIgnoreCase("General_Methods")){
			t1.setText(display3[16]);
			t3.setText(R.string.General_Methods);
		}
	}

	
}
