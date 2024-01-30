package p3;

public class SwapNumbersWithTempVariables {

	public static void main(String[] args) {
		
		int first=10;
		int second=20;
		System.out.println("Before Swap !!");
		System.out.println("first :"+first +"   second :"+second);
		//Start Swapping
		int temp=0;
		temp=first;
		first=second;
		second=temp;
		System.out.println("After Swap !!");
		System.out.println("first :"+first +"   second :"+second);
		

	}

}
