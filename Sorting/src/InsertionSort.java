import java.util.Scanner;


public class InsertionSort {
	
	private static void insertionSort(int[] arr, int n) {
		System.out.println("Before sorting");
		for(int i : arr){
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int j = 1; j < n; j++){
			int key = arr[j];
			int i = j-1;
			
			while(i >= 0 && arr[i] > key){	
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1] = key;		//when i = -1, so we have to insert the key at 0th position
		}
		System.out.println("After sorting");
		for(int m : arr)
			System.out.print(m + " ");
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array");
		int n = sc.nextInt();
		System.out.println("Enter elements in the array");
		int arr[] = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		insertionSort(arr, n);
	}
}
