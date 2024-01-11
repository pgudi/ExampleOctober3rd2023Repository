package com.sgtesting.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {

	public static void main(String[] args) {
	//	matchesDemo();
	//	findDemo1();
	//	displayMatchingWords();
	//	countOfMatchingWords();
	//	displayMatchingPosition();
	//	replaceMatchDemo();
		splitDemo();
	}
	
	private static void matchesDemo()
	{
		Pattern pattern=Pattern.compile("java");
		Matcher match=pattern.matcher("java");
		boolean val=match.matches();
		System.out.println(val);
	}

	private static void findDemo1()
	{
		Pattern pattern=Pattern.compile("java");
		Matcher match=pattern.matcher("java jre java jdk java");
		boolean val=match.find();
		System.out.println(val);
	}
	
	private static void displayMatchingWords()
	{
		Pattern pattern=Pattern.compile("java");
		Matcher match=pattern.matcher("java jre java jdk java");
		while(match.find())
		{
			System.out.println(match.group());
		}
	}
	
	private static void countOfMatchingWords()
	{
		Pattern pattern=Pattern.compile("java");
		Matcher match=pattern.matcher("java jre java jdk java");
		int count=0;
		while(match.find())
		{
			count++;
		}
		System.out.println("# of Occurance :"+count);
	}
	
	private static void displayMatchingPosition()
	{
		Pattern pattern=Pattern.compile("java");
		Matcher match=pattern.matcher("java jre java jdk java");
		while(match.find())
		{
			System.out.println(match.group()+" Start Position :"+match.start()+" end Position:"+match.end());
		}
	}
	
	private static void replaceMatchDemo()
	{
		Pattern pattern=Pattern.compile("java");
		Matcher match=pattern.matcher("java jre java jdk java");
		String str=match.replaceAll("python");
		System.out.println(str);
	}
	
	private static void splitDemo()
	{
		Pattern pattern=Pattern.compile("[!@#$%^]");
		String str[]=pattern.split("Ornage!Mango!Grapes#Banana$Apple%Kiwi fruit^Cherry");
		for(String kk:str)
		{
			System.out.println(kk);
		}
	}
	
}
