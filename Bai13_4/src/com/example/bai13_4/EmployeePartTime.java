package com.example.bai13_4;

public class EmployeePartTime extends Employee{

	@Override
	public double TinhLuong() {
		// TODO Auto-generated method stub
		return 500;
	}
	@Override
	 public String toString() {
	 // TODO Auto-generated method stub
	 return super.toString() +" -->PartTime="+TinhLuong();
	 }

	
}
