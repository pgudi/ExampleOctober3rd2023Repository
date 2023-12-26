package com.sgtesting.calculator.sourcecode;

public class Calculator {

	/**
	 * Method Name: addition
	 */
	public int addition(int firstnumber,int secondnumber)
	{
		int result=0;
		try
		{
			result=(firstnumber + secondnumber);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * Method Name: addition(int a[])
	 */
	public int addition(int numbers[])
	{
		int result=0;
		try
		{
			for(int i=0;i<numbers.length;i++)
			{
				result=result + numbers[i];
			}

		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * Method Name: substraction
	 */
	public int Subtraction(int firstnumber,int secondnumber)
	{
		int result=0;
		try
		{
			result=(firstnumber - secondnumber);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * Method Name: division
	 */
	public int division(int firstnumber,int secondnumber)
	{
		int result=0;
		try
		{
			result=(firstnumber / secondnumber);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * Method Name: multiplication
	 */
	public int multiplication(int firstnumber,int secondnumber)
	{
		int result=0;
		try
		{
			result=(firstnumber * secondnumber);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * Method Name: multiplication(int a[])
	 */
	public int multiplication(int numbers[])
	{
		int result=0;
		try
		{
			for(int i=0;i<numbers.length;i++)
			{
				result=result * numbers[i];
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		return result;
	}
}
