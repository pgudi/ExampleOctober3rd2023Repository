package p3;

public class ReverseTheGivenNumber {

	public static void main(String[] args) {
		int number=12345;
		int digit=0;
		int reverseNum=0;
		while(number != 0)
		{
			digit=number%10; // 3 2 1
			reverseNum=reverseNum*10+digit;
			number=number/10;
		}
		System.out.println("Reverse Number :"+reverseNum);
	}

}
