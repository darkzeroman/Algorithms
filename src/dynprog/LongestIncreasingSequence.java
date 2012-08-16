/**
 * 
 */
package dynprog;

/**
 * @author dkz
 * 
 */
public class LongestIncreasingSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { -10, 5, -2, 1, 4, -100 };
		int ans = LIS(arr);
		System.out.println(ans);
	}

	// Longest Increasing sequence, using aux array
	public static int longestIncreasingSequence(int[] arr) {
		int[] T = new int[arr.length];

		for (int i = 1; i < arr.length; i++)
			T[i] = Math.max(T[i - 1] + arr[i], arr[i]);

		int max = Integer.MIN_VALUE;
		for (int i : T)
			if (i > max)
				max = i;
		return max;
	}

	// Longest Increasing Sequence, using only one variable
	public static int LIS(int[] arr) {
		int max = Integer.MIN_VALUE;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum <= 0)
				sum = 0;
			if (max < sum)
				max = sum;
		}
		return max;
		
	}

}
