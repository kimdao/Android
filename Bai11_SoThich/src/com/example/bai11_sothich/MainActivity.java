package com.example.bai11_sothich;

import android.os.Bundle;
import android.provider.Telephony;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	CheckBox checkBox1, checkBox2, checkBox3, checkBox4; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btnVote = (Button) findViewById(R.id.btnvote);
		btnVote.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String SoThich="";
				checkBox1 =(CheckBox) findViewById(R.id.checkBox1);
				if(checkBox1.isChecked())
					SoThich+=checkBox1.getText()+"\n";
				checkBox2 =(CheckBox) findViewById(R.id.checkBox2);
				if(checkBox2.isChecked())
					SoThich+=checkBox2.getText()+"\n";
				checkBox3 =(CheckBox) findViewById(R.id.checkBox3);
				if(checkBox3.isChecked())
					SoThich+=checkBox3.getText()+"\n";
				checkBox4 =(CheckBox) findViewById(R.id.checkBox4);
				if(checkBox4.isChecked())
					SoThich+=checkBox4.getText()+"\n";
				
				TextView txtXuat = (TextView) findViewById(R.id.txtXuat);
				txtXuat.setText(SoThich);
			}
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
