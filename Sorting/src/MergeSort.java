
public class MergeSort {
	
	private static void mergeSort(int[] arr, int left, int right) {
		if(left < right){
			int mid = (left + right)/2;
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}

	private static void merge(int[] arr, int left, int mid, int right) {
		int m1 = mid - left + 1;		//since mid represents index so +1 to get actual size
		int m2 = right - mid;			//m1 and m2 are size of 1st and 2nd arrays after dividing
		int leftArray[] = new int[m1];
		int rightArray[] = new int[m2];
		
		//copying values in 1st array
		for(int x = 0; x < m1; x++){
			leftArray[x] = arr[left + x]; 
		}
		
		//copying values in 2nd array
		for(int x = 0; x < m2; x++){
			rightArray[x] = arr[mid + 1 + x]; 
		}
		
		int i = 0, j = 0, k = left;
		while(i < m1 && j < m2){
			if(leftArray[i] <= rightArray[j]){
				arr[k] = leftArray[i];
				i++;
			}else{
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		
		while(i < m1){
			arr[k] = leftArray[i];
			i++; k++;
		}
		while(j < m2){
			arr[k] = rightArray[j];
			j++; k++;
		}
	}

	public static void main(String[] args) {
		int arr[] = {8, 5, 9, 1, 6, 7};
		System.out.println("Before sorting");
		for(int i : arr)
			System.out.print(i + " ");
		System.out.println();
	
		int left = 0, right = arr.length - 1;
		mergeSort(arr, left, right);
		
		System.out.println("After sorting");
		for(int i : arr)
			System.out.print(i + " ");
	}
}
