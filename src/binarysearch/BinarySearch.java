package binarysearch;

public class BinarySearch {

	public static int binarySearch(int target, int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		int mid;
		
		while (low <= high) {
			mid = (low + high) / 2;
			if (arr[mid] < target) {
				low = mid + 1;
			} else if (arr[mid] > target) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(binarySearch(3, arr));
	}
}
