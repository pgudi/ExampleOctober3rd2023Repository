package p3;

import java.util.HashMap;

public class DuplicateWordCountDemo {

	public static void main(String[] args) {
		String s="Java,Jre,JVM,Java,Jdk,Jdk,Java,Jira";
		String str[]=s.split(",");
		HashMap<String, Integer> wordCount=new HashMap<String, Integer>();
		
		for(int i=0;i<str.length;i++)
		{
			if(wordCount.containsKey(str[i]))
			{
				wordCount.put(str[i], wordCount.get(str[i])+1);
			}
			else
			{
				wordCount.put(str[i], 1);
			}
		}

		wordCount.forEach((k,v) -> System.out.println(k+" -->"+v));
	}

}
