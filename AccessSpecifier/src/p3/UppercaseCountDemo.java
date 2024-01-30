package p3;

public class UppercaseCountDemo {

	public static void main(String[] args) {
		
		String s="AsDfGHjL";
		int upperCount=0;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isUpperCase(s.charAt(i))==true)
			{
				upperCount=upperCount+1;
			}
		}
		System.out.println("# of Uppercase :"+upperCount);

	}

}
