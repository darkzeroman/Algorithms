package sorts;

public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] unsortedArr = new int[] { 3, 5, 1, 9, 4, 8, 6 };
		// extra int for space for inserted value
		int[] sortedArr = new int[] { 1, 2, 3, 4, 5, 7, 8, 9, 0 };

		insertionSort(unsortedArr);
		insert(sortedArr, 6);

		ArrMethods.printArr(unsortedArr);
		ArrMethods.printArr(sortedArr);

	}

	public static int[] insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			insert(arr, i, arr[i]);
		}
		return arr;
	}

	public static void insert(int[] arr, int num) {
		insert(arr, arr.length - 1, num);
	}

	private static void insert(int[] arr, int position, int num) {
		int i = position - 1;
		while (i >= 0 && arr[i] > num) {
			arr[i + 1] = arr[i];
			i--;
		}
		arr[i + 1] = num;
		// printArr(arr);
	}

}
