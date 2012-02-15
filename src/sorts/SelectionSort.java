/**
 * 
 */
package sorts;

/**
 * @author dkz
 * 
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsortedArr = new int[] { 3, 5, 1, 9, 4, 8, 6 };
		sort(unsortedArr);
		Array.printArr(unsortedArr);
	}

	public static void sort(int[] arr) {
		int minIndex = 0;
		for (int j = 0; j < arr.length; j++) {
			minIndex = j;
			for (int i = j + 1; i < arr.length; i++) {
				if (arr[minIndex] > arr[i])
					minIndex = i;
			}
			Array.swapIndices(arr, minIndex, j);
		}

	}
}
