package p3;

import java.util.HashMap;

public class SumOfOddFrequency {

	public static void main(String[] args) {
	
		int array[] = {1, 2, 4, 5, 6, 3, 1, 2, 3, 3};
		HashMap<Integer,Integer> numCount=new HashMap<Integer,Integer>();
		for(int i=0;i<array.length;i++)
		{
			if(numCount.containsKey(array[i]))
			{
				numCount.put(array[i], numCount.get(array[i])+1);
			}
			else
			{
				numCount.put(array[i], 1);
			}
		}
		System.out.println(numCount);
		int sum=0;
		int value=0;
		for(int key:numCount.keySet())
		{
			
			if(numCount.get(key)%2!=0)
			{
				value=numCount.get(key);
				sum=sum+(key * value);
			}
		}

		System.out.println("Sum of Numbers :"+sum);
	}

}
