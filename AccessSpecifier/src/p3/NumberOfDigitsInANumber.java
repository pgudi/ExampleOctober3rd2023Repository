package p3;

public class NumberOfDigitsInANumber {

	public static void main(String[] args) {
		int number=12345;
		int digit=0;
		while(number != 0)
		{
			number=number/10;
			digit=digit+1;
		}
		System.out.println("# of Digits :"+digit);
	}

}
