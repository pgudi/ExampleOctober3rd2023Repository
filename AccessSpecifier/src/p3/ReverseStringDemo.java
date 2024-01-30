package p3;

import java.util.Scanner;

public class ReverseStringDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String :");
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		String str="";
		for(int i=ch.length-1;i>=0;i--)
		{
			str=str+ch[i];
		}
		System.out.println(str);
		sc.close();
	}

}
