package p3;

public class UppercaseCountDemo2 {

	public static void main(String[] args) {

		String s="AsDfGHjL";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90)
			{
				count++;
			}
		}

		System.out.println("# of Uppercase :"+count);
	}

}
