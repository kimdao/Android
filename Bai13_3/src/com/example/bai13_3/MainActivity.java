package com.example.bai13_3;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	
	EditText editten;
	TextView txthienthi;
	ListView lvPerson;
	Button btnNhap;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		editten =(EditText)findViewById(R.id.editTen);
		txthienthi = (TextView)findViewById(R.id.txtHienThi);
		lvPerson = (ListView)findViewById(R.id.lvperson);
		final ArrayList<String>arrList=new ArrayList<String>();
		final ArrayAdapter<String> adapter=new ArrayAdapter<String> (this,android.R.layout.simple_list_item_1, arrList);
		lvPerson.setAdapter(adapter);
		Button btnNhap =(Button) findViewById(R.id.btnNhap);
		btnNhap.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				arrList.add(editten.getText()+"");
				 adapter.notifyDataSetChanged();

			}
		});
		
		lvPerson.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				// TODO Auto-generated method stub
				
				txthienthi.setText("position : "+ arg2+
						 "; value ="+arrList.get(arg2));
			}
		});

		lvPerson.setOnItemLongClickListener(new OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				// TODO Auto-generated method stub
				
				arrList.remove(arg2);//xóa phần tử thứ arg2
				adapter.notifyDataSetChanged();
				return false;
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
