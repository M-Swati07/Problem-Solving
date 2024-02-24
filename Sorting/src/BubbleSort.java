import java.util.Scanner;

public class BubbleSort {
	
	private static void bubblesort(int[] arr, int length) {
		System.out.println("Elements before sorting");
		for(int i : arr){		//for-each loop traverses through the array and each element gets stored in i
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("Sorting every iteration");
		int temp;
		for(int i = 0; i < length; i++){
			for(int j = 0; j < length-i-1; j++){	//length-i-1 will ensure the comparison is not done with elements already swapped at the end 
				if(arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			for(int m : arr)
				System.out.print(m + " ");
			System.out.println();
		}
		System.out.println("Elements after sorting");
		for(int k : arr){
			System.out.print(k + " ");
		}
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
		bubblesort(arr, length);
	}
}
