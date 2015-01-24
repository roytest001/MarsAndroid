package com.example.s01_e16_timerpicker;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.TimePicker.OnTimeChangedListener;

public class MainActivity extends Activity {
	
	private TimePicker firstTimePicker;
	private Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		firstTimePicker = (TimePicker)findViewById(R.id.firstTimePicker);
		button =(Button)findViewById(R.id.button);
		firstTimePicker.setIs24HourView(true);
		TimeListener timelistener = new TimeListener();
		firstTimePicker.setOnTimeChangedListener(timelistener);	
		ButtonListener1 buttonlistener = new ButtonListener1();
		button.setOnClickListener(buttonlistener );

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	class TimeListener implements OnTimeChangedListener{

		@Override
		public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
			// TODO Auto-generated method stub
			System.out.println("Hour: " + hourOfDay + ",minute: " + minute);
		}
		
	}
	
	
	class ButtonListener1 implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			int hour = firstTimePicker.getCurrentHour();
			int miniute = firstTimePicker.getCurrentMinute();
			System.out.println("h:" + hour + ", m:" + miniute );
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
