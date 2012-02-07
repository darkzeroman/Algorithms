/**
 * 
 */
package sorts;

/**
 * @author dkz
 * 
 */
public class HeapSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsortedArr = new int[]{5,3,16,2,10,14};
		sort(unsortedArr);
		CommonMethods.printArr(unsortedArr);
	}

	public static void sort(int[] arr) {
		buildHeap(arr);
		for (int i = arr.length - 1; i > 0; i--) {
			CommonMethods.inArraySwap(arr, 0, i);
			heapify(arr, 0, i);
		}
	}

	public static void buildHeap(int[] arr) {
		for (int i = arr.length / 2 - 1; i >= 0; i--)
			heapify(arr, i, arr.length);
	}

	private static void heapify(int[] arr, int i, int max) {
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int largest = 0;
		if (left < max && arr[left] > arr[i])
			largest = left;
		else
			largest = i;
		if (right < max && arr[right] > arr[largest])
			largest = right;
		if (largest != i) {
			CommonMethods.inArraySwap(arr, i, largest);
			heapify(arr, largest, max);
		}

	}
}
