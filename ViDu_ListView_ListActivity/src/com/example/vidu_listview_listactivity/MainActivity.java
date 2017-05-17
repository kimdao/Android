package com.example.vidu_listview_listactivity;

import android.support.v7.app.ActionBarActivity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity{

	TextView selection;
	String arr[]={"Intel","SamSung",
	 "Nokia","Simen","AMD",
	 "KIC","ECD"};
	ArrayAdapter<String>adapter = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		selection = (TextView)findViewById(R.id.textView1);
		adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr);
		setListAdapter(adapter);
		
	}

	@Override
	 protected void onListItemClick(ListView l, View v, int position, long id) {
	 // TODO Auto-generated method stub
		 super.onListItemClick(l, v, position, id);
		 String txt="postion = "+position +"; value ="+arr[position];
		 selection.setText(txt);
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
