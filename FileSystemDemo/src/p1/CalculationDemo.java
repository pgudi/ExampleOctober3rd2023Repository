package p1;
class Calculate
{
	int addition(int x,int y)
	{
		return (x+y);
	}
	
	int sub1(int x,int y)
	{
		return (x-y);
	}
	
	void multiplication(int x,int y)
	{
		int res=(x * y);
		System.out.println("Multiplication Result:"+res);
	}
}
public class CalculationDemo {

	public static void main(String[] args) {
		Calculate o=new Calculate();
		o.multiplication(o.addition(10, 25), o.sub1(100, 90));

	}

}
