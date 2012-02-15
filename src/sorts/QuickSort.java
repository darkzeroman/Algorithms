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
		int[] sortedArr = new int[] { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		int[] unsortedArr = new int[] { 3, 5, 1, 9, 4, 8, 6, 10 };

		sort(sortedArr);
		sort(unsortedArr);
		// partition(unsortedArr, 0, unsortedArr.length-1);
		Array.printArr(sortedArr);
		Array.printArr(unsortedArr);

	}

	public static int[] sort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
		return arr;
	}

	private static void quickSort(int[] arr, int left, int right) {
		if (left < right) {
			int partition = partition(arr, left, right);
			quickSort(arr, left, partition);
			quickSort(arr, partition + 1, right);
		}

	}

	private static int partition(int[] arr, int left, int right) {
		if (right - left < 0)
			System.out.println("error?");
		int pivot = left + random.nextInt(right - left);
		Array.swapIndices(arr, pivot, right);
		int store = left;

		for (int i = left; i < right; i++) {
			if (arr[i] <= arr[right]) {
				Array.swapIndices(arr, i, store);
				store++;
			}
		}
		Array.swapIndices(arr, store, right);

		return store;

	}

}
