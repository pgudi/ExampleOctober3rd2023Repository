package p3;

public class SwapNumbersWithoutTempVariable {

	public static void main(String[] args) {
		int first=50;
		int second=10;
		System.out.println("Before Swap !!");
		System.out.println("first :"+first +"   second :"+second);
		//Start Swapping
		first=first-second; //10
		second=first+second; //20
		first=second-first;   //10
		System.out.println("After Swap !!");
		System.out.println("first :"+first +"   second :"+second);

	}

}
