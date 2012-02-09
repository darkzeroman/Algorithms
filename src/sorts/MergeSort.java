/**
 * 
 */
package sorts;

/**
 * @author 01
 * 
 */
public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 3, 4, 2, 6, 7, 1 };
		sort(arr);
	}

	public static void sort(int[] arr) {
		mergeSort(arr, 0, arr.length - 1);

	}

	public static int[] mergeSort(int[] arr, int left, int right) {
		if (right > left) {
			int mid = left + (right - left) / 2;
			mergeSort(arr, helper, left, mid);
			mergeSort(arr, helper, )
		}

		return arr;
	}

	private static int[] merge(int[] arr, int a, int b, int max) {
		int[] ans = new int[2 * max];
		int c = 0;
		int med = a + max;
		int high = b + max;
		while (a < med && b < high) {
			if (arr[a] < arr[b]) {
				ans[c] = arr[a];
				a++;
				c++;
			} else {
				ans[c] = arr[b];
				b++;
				c++;
			}
		}
		if (a == max)
			for (int i = c; i < high; i++) {
				ans[c] = arr[b];
				b++;
			}
		else
			for (int i = c; i < high; i++) {
				ans[c] = arr[a];
				a++;
			}
		System.arraycopy(ans, 0, arr, a, 2 * max);
		return arr;
	}

}
