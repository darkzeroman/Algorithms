package sorts;

public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// has extra char for place holder for value to be inserted
		int[] sortedArr = new int[] { 1, 2, 3, 4, 5, 7, 8, 9, 0 };
		int[] unsortedArr = new int[] { 3, 5, 1, 9, 4, 8, 6 };

		insertionSort(unsortedArr);
		insert(sortedArr, 6);
		
		printArr(unsortedArr);
		printArr(sortedArr);
		
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

	public static void insert(int[] arr, int position, int num) {
		int i = position - 1;
		while (i >= 0 && arr[i] > num) {
			arr[i + 1] = arr[i];
			i--;
		}
		arr[i + 1] = num;
		// printArr(arr);
	}

	public static void printArr(int[] arr) {
		StringBuffer bs = new StringBuffer(arr.length * 2);
		for (int i = 0; i < arr.length; i++) {
			bs.append(Character.forDigit(arr[i], 10));
			bs.append(" ");
		}
		System.out.println(bs);

	}
}
