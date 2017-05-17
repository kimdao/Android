package com.example.bai13_4;

import java.util.ArrayList;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;

public class MainActivity extends ActionBarActivity {

	
	EditText editma,editten;
	Button btnnhap;
	RadioGroup radgroup;
	ListView lvNhanvien;
	ArrayList<Employee>arrEmployee=new ArrayList<Employee>();
	ArrayAdapter<Employee>adapter=null;
	 //Khai báo 1 employee object
	 Employee employee=null;
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 editma=(EditText) findViewById(R.id.editMa);
		 editten=(EditText) findViewById(R.id.editTen);
		 btnnhap=(Button) findViewById(R.id.btnNhap);
		 radgroup=(RadioGroup) findViewById(R.id.radGroup);
		 lvNhanvien=(ListView) findViewById(R.id.lvNhanVien);
		 //đưa Data Source là các employee vào Adapter
		 adapter=new ArrayAdapter<Employee>(this,
		 android.R.layout.simple_list_item_1,
		 arrEmployee);
		 //đưa adapter vào ListView
		 lvNhanvien.setAdapter(adapter);
		 
		 btnnhap.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				processNhap();
			}
		});
	}

	
	public void processNhap()
	 {
	 //Lấy ra đúng id của Radio Button được checked
	 int radId=radgroup.getCheckedRadioButtonId();
	 String id=editma.getText()+"";
	 String name=editten.getText()+"";
	 if(radId==R.id.radChinhThuc)
	 {
	 //tạo instance là FullTime
	employee = new EmployeeFullTime() {
	};
	 }
	 else
	 {
	 //Tạo instance là Partime
	 employee=new EmployeePartTime();
	 }
	 //FullTime hay Partime thì cũng là Employee
	 //nên có các hàm này là hiển nhiên
	 employee.setId(id);
	 employee.setName(name);
	 //Đưa employee vào ArrayList
	 arrEmployee.add(employee);
	 //Cập nhập giao diện
	 adapter.notifyDataSetChanged();
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
