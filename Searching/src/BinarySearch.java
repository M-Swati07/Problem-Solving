
public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = {2, 4, 6, 8, 10, 12};
		int target = 8;
		int result = binarySearch(arr, target);
		if(result == -1)
			System.out.println("Target Not Found");
		else System.out.println(target +" is present at index "+ result);
	}

	private static int binarySearch(int[] arr, int target) {
		int start = 0, end = arr.length - 1, steps = 0;
		while(start <= end){
			steps++;
			int mid = (start + end)/2;
			
			if(arr[mid] == target){
				System.out.println("Steps taken by Binary Search : " +steps);
				return mid;
			}
			else if(arr[mid] < target)
				start = mid + 1;
			else end = mid - 1;
		}
		System.out.println("Steps taken by Binary Search : " +steps);
		return -1;
	}

}
