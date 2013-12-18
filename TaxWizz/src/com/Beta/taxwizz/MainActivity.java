package com.Beta.taxwizz;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Spinner;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void nextScreen (View clickedButton){
		Spinner taxtype=(Spinner) findViewById(R.id.spinner2);
		int position=taxtype.getSelectedItemPosition();
		if(position==0){
			Intent startActivity=new Intent(getApplicationContext(),SalestaxActivity.class);
			startActivity(startActivity);
		} else if (position ==1){
			Intent startActivity=new Intent (getApplicationContext(),IncometaxActivity.class);
			startActivity(startActivity);
		}
	}

}
