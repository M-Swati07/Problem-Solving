
public class LinearSearch {

	public static void main(String[] args) {
		int arr[] = {2, 4, 6, 8, 10, 12};
		int target = 8;
		int result = linearSearch(arr, target);
		if(result == -1)
			System.out.println("Target not found");
		else
			System.out.println(target +" found at index "+ result);
	}

	private static int linearSearch(int[] arr, int target) {
		int steps = 0;
		for(int i = 0; i < arr.length; i++){
			steps++;
			if(arr[i] == target){
				System.out.println("Steps taken by Linear Search : " +steps);
				return i;
			}
		}
		System.out.println("Steps taken by Linear Search : " +steps);
		return -1;
	}

}
