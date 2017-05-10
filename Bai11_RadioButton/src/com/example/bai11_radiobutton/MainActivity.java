package com.example.bai11_radiobutton;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btnVote = (Button) findViewById(R.id.btnVote);
		btnVote.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				RadioGroup group =(RadioGroup) findViewById(R.id.radioGroup1);
				int idChecked=group.getCheckedRadioButtonId();
				switch(idChecked)
				{
				case R.id.radRatThich:
					break;
				case R.id.radHoiThich:
					break;
				case R.id.radlunglay:
					break;
				case R.id.radGhet:
					break;
				case R.id.radBaoCongAn:
					break;
				}
				RadioButton rad = (RadioButton) findViewById(idChecked);
				
				String YeuThich =(String) rad.getText();
				
			TextView txtXuat = (TextView) findViewById(R.id.txtXuat);
			txtXuat.setText(YeuThich);;
		}; 
			
			
		});
		
		
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
}
