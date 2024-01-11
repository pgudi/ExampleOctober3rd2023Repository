package com.sgtesting.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo2 {

	public static void main(String[] args) {
	//	regExpExample1();
		regExpExample2();
	}
	
	private static void regExpExample1()
	{
		String str="Bangalore received 125 milimeter of rain yesterday";
		Pattern pattern=Pattern.compile("[0-9]{3}");
		Matcher match=pattern.matcher(str);
		
		String strResult=match.replaceAll("many");
		System.out.println(strResult);
	}

	private static void regExpExample2()
	{
		String str="The temple is at the top of the hill";
		Pattern pattern=Pattern.compile("[a-zA-z]+");
		Matcher match=pattern.matcher(str);
		
		while(match.find())
		{
			System.out.println(match.group());
		}
	}
}
