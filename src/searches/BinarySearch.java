/**
 * 
 */
package searches;

/**
 * @author dkz
 * 
 */
public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sortedArr = new int[] { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		recSearch(sortedArr, 8);
		iterSearch(sortedArr, 8);
	}

	public static void recSearch(int[] arr, int num) {
		int loc = recBinSearchIndex(arr, num, 0, arr.length - 1);
		boolean found = recBinSearch(arr, num, 0, arr.length - 1);
		System.out
				.println("Recursive Search: Found?: " + found + " at: " + loc);
	}

	public static void iterSearch(int[] arr, int num) {
		boolean found = iterBinSearch(arr, num);
		System.out.println("Iterative Search: Found?: " + found);

	}

	public static int recBinSearchIndex(int[] arr, int num, int left, int right) {
		if (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == num)
				return mid;
			else if (arr[mid] > num)
				return recBinSearchIndex(arr, num, left, mid - 1);
			else
				return recBinSearchIndex(arr, num, mid + 1, right);
		} else
			return -1;
	}

	public static boolean recBinSearch(int[] arr, int num, int left, int right) {
		if (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == num)
				return true;
			else if (arr[mid] > num)
				return recBinSearch(arr, num, left, mid - 1);
			else
				return recBinSearch(arr, num, mid + 1, right);
		} else
			return false;
	}

	public static boolean iterBinSearch(int[] arr, int num) {
		int left = 0;
		int right = arr.length - 1;
		int mid;
		while (left <= right) {
			mid = left + (right - left) / 2;
			if (arr[mid] == num)
				return true;
			else if (arr[mid] < num)
				left = mid + 1;
			else
				right = mid - 1;

		}
		return false;
	}
}
