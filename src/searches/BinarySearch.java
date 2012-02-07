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
		int loc = search(sortedArr, 8);
		System.out.println(binarySearchIterative(sortedArr, 11));
	}

	public static int search(int[] arr, int num) {
		return binarySearchIndex(arr, num, 0, arr.length - 1);
	}

	public static int binarySearchIndex(int[] arr, int num, int left, int right) {
		if (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == num)
				return mid;
			else if (arr[mid] > num)
				return binarySearchIndex(arr, num, left, mid - 1);
			else
				return binarySearchIndex(arr, num, mid + 1, right);
		} else
			return -1;
	}

	public static boolean binarySearchBoolean(int[] arr, int num, int left,
			int right) {
		if (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == num)
				return true;
			else if (arr[mid] > num)
				return binarySearchBoolean(arr, num, left, mid - 1);
			else
				return binarySearchBoolean(arr, num, mid + 1, right);
		} else
			return false;
	}

	public static boolean binarySearchIterative(int[] arr, int num) {
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
