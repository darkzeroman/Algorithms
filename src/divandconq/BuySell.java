/**
 * 
 */
package divandconq;

/**
 * @author dkz
 * 
 */
public class BuySell {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] out = buyAndSell(new int[] { 3, 4, 5, 1, 2, 5, 7, 80, 100 }, 0, 8);
		System.out.println("Buy: " + out[0] + ", Sell: " + out[1]
				+ ", Profit: " + out[2]);

	}

	public static int[] buyAndSell(int[] arr, int low, int high) {
		int m = low + (high - low + 1) / 2;
		int[] minmaxprofit = new int[3];

		if (high - low == 1)
			minmaxprofit = new int[] { arr[m], arr[m], Integer.MIN_VALUE };

		if (high - low > 1) {
			int[] left = buyAndSell(arr, low, m);
			int[] right = buyAndSell(arr, m, high);
			int leftRightProfit = right[1] - left[0];

			int profit = Math.max(Math.max(left[2], right[2]), leftRightProfit);

			int min = Math.min(left[0], right[0]);
			int max = Math.max(left[1], right[1]);

			minmaxprofit = new int[] { min, max, profit };
		}

		return minmaxprofit;
	}
}
