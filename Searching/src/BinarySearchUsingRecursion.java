
public class BinarySearchUsingRecursion {

	public static void main(String[] args) {
		int arr[] = {2, 4, 6, 8, 10, 12};
		int target = 8;
		int result = binarySearch(arr, target, 0, arr.length-1);
		if(result == -1)
			System.out.println("Target Not Found");
		else System.out.println(target +" is present at index "+ result);
	}

	private static int binarySearch(int[] arr, int target, int start, int end) {
		if(start <= end){
			int mid = (start + end)/2;
			
			if(arr[mid] == target)
				return mid;
			else if(arr[mid] < target)
				return binarySearch(arr, target, mid+1, end);
			else return binarySearch(arr, target, start, mid-1);
		}
		return -1;
	}

}
