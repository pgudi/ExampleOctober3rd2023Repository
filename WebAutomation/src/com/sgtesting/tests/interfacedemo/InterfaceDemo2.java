package com.sgtesting.tests.interfacedemo;
interface RevaUniversity
{
	default void showUniversityName(String name)
	{
		System.out.println("University Name :"+name);
	}
}

interface JainUniversity
{
	default void showUniversityName(String name)
	{
		System.out.println("University Name :"+name);
	}
}

class EngineeringCollege implements RevaUniversity,JainUniversity
{

	@Override
	public void showUniversityName(String name) {
		System.out.println("University Name :"+name);
	}
	
}
public class InterfaceDemo2 {
	public static void main(String[] args) {
		EngineeringCollege pes=new EngineeringCollege();
		pes.showUniversityName("VTU University");

	}

}
