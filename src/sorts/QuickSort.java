package sorts;

import java.util.Random;

/**
 * @author dkz
 * 
 */
public class QuickSort {
	static Random random = new Random();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sortedArr = new int[] { 1, 2, 3, 4, 5, 7, 8, 9, 0 };
		int[] unsortedArr = new int[] { 3, 5, 1, 9, 4, 8, 6 };
		sort(unsortedArr);
		
		//partition(unsortedArr, 0, unsortedArr.length-1);
		CommonMethods.printArr(unsortedArr);

	}

	public static void sort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
	}

	static void quickSort(int[] arr, int left, int right) {
		if (left < right) {
			int partition = partition(arr, left, right);
			quickSort(arr, left, partition);
			quickSort(arr, partition + 1, right);
		}

	}

	static int partition(int[] arr, int left, int right) {

		int pivot = left + random.nextInt(right-left);
		CommonMethods.inArraySwap(arr, pivot, right);
		int store = left;

 		for (int i = left; i < right; i++) {
			if (arr[i] <= arr[right]) {
				CommonMethods.inArraySwap(arr, i, store);
				store++;
			}
		}
		CommonMethods.inArraySwap(arr, store, right);

		return store;

	}


}
