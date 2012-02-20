/**
 * 
 */
package exercises;

import java.util.Hashtable;

/**
 * @author 01
 * 
 */
public class SumPairConstant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 2, 3, 4, 5, 6, 7, 8, 7 };
		sumArrPairsToConstant(arr, 11);
	}

	public static void sumArrPairsToConstant(int[] arr, int num) {
		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			ht.put(arr[i], i);
			int complement = num - arr[i];
			if (ht.containsKey(complement)) {
				System.out.println("Indices: " + i + " " + ht.get(complement));
				return;
			}
		}
		System.out.println("No Pairs Sum to Constant");
	}

}
