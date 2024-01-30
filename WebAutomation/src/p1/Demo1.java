package p1;

class T1
{
	void message()
	{
		System.out.println("This is outer class");
	}
	
	
	 static class S1
	{
		 static void result(int a, int b)
	{		
		T1 o= new T1();
		 o.message();
		int sum=a+b;
		System.out.println(sum);
	   }
	}

}
public class Demo1 {

	public static void main(String[] args) {	
	
		p1.T1.S1.result(2,5);
	
	}

}
