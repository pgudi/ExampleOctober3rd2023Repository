package p3;
public class BubleSortDemo {

	public static void main(String[] args) {
		int arr[]= {7,8,3,1,2,5};
		int temp=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}

		displayArray(arr);
	}
	
	private static void displayArray(int x[])
	{
		System.out.println("Sorted Array !!");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		}
	}

}
