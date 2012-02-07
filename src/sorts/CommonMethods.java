/**
 * 
 */
package sorts;

/**
 * @author dkz
 * 
 */
public class CommonMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void printArr(int[] arr) {
		StringBuffer bs = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			bs.append(arr[i]);
			bs.append(" ");
		}
		System.out.println(bs);

	}

	static void inArraySwap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
