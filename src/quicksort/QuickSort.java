package quicksort;

public class QuickSort {

	public void swap(int left, int right, int[] arr) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
	
	public void quickSort(int left, int right, int[] arr) {
		int target = left;
		int pivot = left;
		int inc = left + 1;
		
		if (left < right) {
			for (; inc <= right; inc++) {
				if (arr[inc] < arr[pivot]) {
					target++;
					swap(inc, target, arr);
				}
			}
			
			swap(pivot, target, arr);
			pivot = target;
			
			quickSort(left, pivot - 1, arr);
			quickSort(pivot + 1, right, arr);
		}
	}
	
	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort();
		
		int[] arr = {5,3,4,6,7,9,10,1,2};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");			
		}
		System.out.println();			
		
		quickSort.quickSort(0, arr.length - 1, arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");			
		}
	}
}
