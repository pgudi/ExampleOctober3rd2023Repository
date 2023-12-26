package com.sgtesting.tests;
interface University
{
	void showUniversityName(String name);
}
interface College
{
	void showCollegeName(String name);
}
class BMSEngg implements University,College
{

	@Override
	public void showCollegeName(String name) {
		System.out.println("Engineering College Name :"+name);
		
	}

	@Override
	public void showUniversityName(String name) {
		System.out.println("University Name :"+name);
		
	}
	
}
public class InterfaceDemo {
	public static void main(String[] args) {
		University university=new BMSEngg();
		university.showUniversityName("VTU Belguam");

		College college=(College) university;
		college.showCollegeName("BMS Engineering College");
	}

}
