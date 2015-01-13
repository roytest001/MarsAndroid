package com.example.s01_e09_checkbox;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class MainActivity extends Activity {
	
	private CheckBox eatBox;
	private CheckBox sleepBox;
	private CheckBox dotaBox;
	private CheckBox allBox;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		
		eatBox =(CheckBox)findViewById(R.id.eatId);
		sleepBox =(CheckBox)findViewById(R.id.sleepId);
		dotaBox =(CheckBox)findViewById(R.id.dotaId);
		allBox =(CheckBox)findViewById(R.id.allId);
		OnBoxClickListener listener = new OnBoxClickListener();
		eatBox.setOnClickListener(listener);
		sleepBox.setOnClickListener(listener);
		dotaBox.setOnClickListener(listener);
		allBox.setOnClickListener(listener);	

		CheckBoxListener listener2 = new CheckBoxListener();
		eatBox.setOnCheckedChangeListener(listener2);
		sleepBox.setOnCheckedChangeListener(listener2);
		dotaBox.setOnCheckedChangeListener(listener2);
		allBox.setOnCheckedChangeListener(listener2);


		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	class CheckBoxListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(CompoundButton buttonView,
				boolean isChecked) {
			// TODO Auto-generated method stub
			if(buttonView.getId() == R.id.eatId){
				System.out.println("Checked eatBox");
			}
			else if(buttonView.getId() == R.id.sleepId){
				System.out.println("Checked sleepBox");
			}
			else if(buttonView.getId() == R.id.dotaId){
				System.out.println("Checked dotaBox");
			}
			else if(buttonView.getId() == R.id.allId){
				System.out.println("Checked AllBox");
				
				if(isChecked){
					System.out.println("set all boxs are checked");
					eatBox.setChecked(isChecked);
					dotaBox.setChecked(isChecked);
					sleepBox.setChecked(isChecked);					
				}
				else{
					System.out.println("set all boxs are unchecked");
					eatBox.setChecked(false);
					dotaBox.setChecked(false);
					sleepBox.setChecked(false);	
				}
;
			}
				
			if(isChecked){
				System.out.println(" ischecked");
			}
			else{
				System.out.println(" isunchecked");

			}
		}
		
	}
	
	
	class OnBoxClickListener implements OnClickListener{
		public void onClick(View view){
			
			CheckBox box = (CheckBox)view;
			
			if(view.getId() == R.id.eatId){
				System.out.println("eatBox");
			}
			else if(view.getId() == R.id.dotaId){
				System.out.println("dotaBox");
			}
			else if(view.getId() == R.id.sleepId){
				System.out.println("sleepBox");
			}
			
			if (box.isChecked()){
				System.out.println("Box.isChecked");
			}
			else{
				System.out.println("Box.unchecked");
			}
			
			
			System.out.println("CheckBox is clicked");
		}
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
}
