package com.example.e01_s05_view;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private TextView textView;
	private Button button;
	int count = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);		
		textView =(TextView)findViewById(R.id.textView);
		button=(Button)findViewById(R.id.button);
		textView.setBackgroundColor(Color.YELLOW);
		textView.setText("Hello Roy!!!");
		ButtonListener buttonListener = new ButtonListener();
		button.setOnClickListener(buttonListener);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
	
	class ButtonListener implements OnClickListener{		

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		count++;
		textView.setText(count + " ");
	}
	}
}
