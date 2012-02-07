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
		CommonMethods.printArr(unsortedArr);
	}

	public static void sort(int[] arr) {
		int minIndex = 0;
		for (int j = 0; j < arr.length; j++) {
			minIndex = j;
			for (int i = j; i < arr.length; i++) {
				if (arr[minIndex] > arr[i])
					minIndex = i;
			}
			CommonMethods.inArraySwap(arr, minIndex, j);
		}

	}
}
