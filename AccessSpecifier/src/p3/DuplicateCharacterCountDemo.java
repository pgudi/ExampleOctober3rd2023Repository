package p3;

import java.util.HashMap;
import java.util.Set;
// p=1 a=2 l=2 v=1 i=1
public class DuplicateCharacterCountDemo {

	public static void main(String[] args) {

		String s="pallavi";
		char ch[]=s.toCharArray();
		HashMap<Character, Integer> charCount=new HashMap<Character, Integer>();
		
		for(int i=0;i<ch.length;i++)
		{
			if(charCount.containsKey(ch[i]))
			{
				charCount.put(ch[i], charCount.get(ch[i])+1);
			}
			else
			{
				charCount.put(ch[i], 1);
			}
		}
		System.out.println(charCount);
				
		//Display Duplicate charactes only
		Object[] arr=charCount.keySet().toArray();
		for(int i=0;i<arr.length;i++)
		{
			if(charCount.get(arr[i])>1)
			{
				System.out.println(arr[i]+"  "+charCount.get(arr[i]));
			}
		}
		//Unique Characters
		for(int i=0;i<arr.length;i++)
		{
			if(charCount.get(arr[i])==1)
			{
				System.out.println(arr[i]+"  "+charCount.get(arr[i]));
			}
		}
	}

}
