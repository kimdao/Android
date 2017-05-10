package com.example.bai11_tonghop;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.*;

public class MainActivity extends ActionBarActivity {

	EditText editTen,editCMND,editBoSung;
	CheckBox chkDocBao, chkDocSach, chkDocCoding;

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		editTen=(EditText) findViewById(R.id.editTen);
		editCMND=(EditText) findViewById(R.id.editCMND);
		editBoSung=(EditText) findViewById(R.id.editBoSung);
		chkDocBao=(CheckBox) findViewById(R.id.chkDocBao);
		chkDocSach=(CheckBox) findViewById(R.id.chkDocSach);
		chkDocCoding=(CheckBox) findViewById(R.id.chkDocCoding);
		
		Button btn=(Button) findViewById(R.id.btnThongTin);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
			}
		});

	}
	
	public void doShowInformation()
	{
	String ten=editTen.getText()+"";
	ten=ten.trim();
	if(ten.length()<3)
	{
	editTen.requestFocus();
	editTen.selectAll();
	Toast.makeText(this, "Tên phải >= 3 ký tự", Toast.LENGTH_LONG).show();
	return  ;
	}

	String cmnd=editCMND.getText()+"";
	cmnd=cmnd.trim();
	if(cmnd.length()!=9)
	{
	editCMND.requestFocus();
	editCMND.selectAll();
	Toast.makeText(this, "CMND phải đúng 9 ký tự", Toast.LENGTH_LONG).show();
	return;
	}

	String bang="";
	RadioGroup group=(RadioGroup) findViewById(R.id.radioGroup1);
	int id=group.getCheckedRadioButtonId();
	if(id==-1)
	{
	Toast.makeText(this, "Phải chọn bằng cấp", Toast.LENGTH_LONG).show();
	return;
	}
	RadioButton rad=(RadioButton) findViewById(id);
	bang=rad.getText()+"";
	String sothich="";
	if(chkDocBao.isChecked())
	sothich+=chkDocBao.getText()+"\n";
	if(chkDocSach.isChecked())
	sothich+=chkDocSach.getText()+"\n";
	if(chkDocCoding.isChecked())
	sothich+=chkDocCoding.getText()+"\n";
	String bosung=editBoSung.getText()+"";
	AlertDialog.Builder builder=new AlertDialog.Builder(this);
	builder.setTitle("Thông tin cá nhân");
	builder.setPositiveButton("Đóng", new OnClickListener() {
		
		@Override
		public void onClick(DialogInterface dialog, int which) {
			// TODO Auto-generated method stub
			
		}
	});
	String msg=ten+"\n";
	msg+= cmnd+"\n";
	msg+=bang+"\n";
	msg+=sothich;
	msg+="—————————–\n";
	msg+="Thông tin bổ sung:\n";
	msg+=bosung+ "\n";
	msg+="—————————–";
	builder.setMessage(msg);//thiết lập nội dung
	builder.create().show();//hiển thị Dialog
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
