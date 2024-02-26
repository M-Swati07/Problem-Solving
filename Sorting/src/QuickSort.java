
public class QuickSort {
	
	private static void quickSort(int[] arr, int low, int high) {
		
		if(low < high){
			
			int pivot = partition(arr, low, high);
			
			quickSort(arr, low, pivot - 1);
			quickSort(arr, pivot + 1, high);
		}
	}

	private static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		
		for(int j = low; j < high; j++){
			if(arr[j] < pivot){
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;		//pivot
		
	}

	public static void main(String[] args) {
		int arr [] = {5, 6, 3, 2, 9, 7};
		int low = 0, high = arr.length - 1;
		quickSort(arr, low, high);
		
		for(int i : arr)
			System.out.print(i + " ");
	}
}
