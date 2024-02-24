import java.util.Scanner;

public class SelectionSort {
	
	private static void selectionsort(int[] arr, int length) {
		System.out.println("Elements before sorting");
		for(int i : arr)
			System.out.print(i + " ");
		
		System.out.println();
		System.out.println("Sorting every iteration");
		int temp;
		for(int i = 0; i < length; i++){
			int minIndex = i;
			for(int j = i+1; j < length; j++){
				if(arr[minIndex] > arr[j])		//finding the min value in inner loop
					minIndex = j;
			}
			//swapping once in outer loop
			temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
			
			for(int k : arr)
				System.out.print(k + " ");
			System.out.println();
		}
		
		System.out.println("Elements after sorting");
		for(int i : arr)
			System.out.print(i + " ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length in the array");
		int length = sc.nextInt();
		int arr[] = new int[length];
		System.out.println("enter the elements in the array");
		for(int i=0; i<length; i++){
			arr[i] = sc.nextInt();
		}
		selectionsort(arr, length);
	}
}
