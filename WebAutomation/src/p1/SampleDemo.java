package p1;
class Sample
{
	static Sample obj=null;
	
	private Sample() {
		
	}
	
	void multiplication()
	{
		int res=(10 * 19 );
		System.out.println("Multiplication Result :"+res);
	}
	
	static Sample addition()
	{
		obj=new Sample();
		return obj;
	}
}
public class SampleDemo {
	public static void main(String[] args) {
		Sample.addition().multiplication();

	}

}
