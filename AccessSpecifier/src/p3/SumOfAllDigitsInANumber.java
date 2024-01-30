package p3;

public class SumOfAllDigitsInANumber {

	public static void main(String[] args) {
		int number=1234;
		int sum=0;
		int digits=0;
		while(number != 0)
		{
			digits=number%10; 
			sum=sum+digits;
			number=number/10;
		}
		System.out.println("Sum of All Number :"+sum);
	}

}
