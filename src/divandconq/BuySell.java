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
		int[] out = buyAndSell(new int[] { 10, 7 }, 0, 2);
		System.out.println("Buy: " + out[0] + ", Sell: " + out[1]
				+ ", Profit: " + out[2]);

		int[] input = new int[] { 10, 7, 8 };

		System.out.println(maxProfitRecursion(input, 0, input.length - 1));

	}

	public static int[] buyAndSell(int[] arr, int low, int high) {
		int m = low + (high - low + 1) / 2;
		int[] minmaxprofit = new int[3];

		if (high - low == 1)
			minmaxprofit = new int[] { arr[low], arr[low], 0 };

		if (high - low > 1) {
			int[] left = buyAndSell(arr, low, m);
			int[] right = buyAndSell(arr, m, high);
			int leftRightProfit = right[1] - left[0]; // max-min

			int profit = Math.max(Math.max(left[2], right[2]), leftRightProfit);

			int min = Math.min(left[0], right[0]);

			int max = Math.max(left[1], right[1]);
			if (profit == left[2])
				max = left[1];
			else
				max = right[1];

			minmaxprofit = new int[] { min, max, profit };
		}

		return minmaxprofit;
	}

	public static ThreeVal maxProfitRecursion(int[] input, int low, int high) {

		if (low == high) {
			return new ThreeVal(input[low], input[high], 0);
		}

		int mid = low + (high - low) / 2;

		ThreeVal left = maxProfitRecursion(input, low, mid);
		ThreeVal right = maxProfitRecursion(input, mid + 1, high);

		int maxProfit = Math.max(right.max - left.min,
				Math.max(right.profitMax, left.profitMax));

		return new ThreeVal(Math.min(left.min, right.min), Math.max(left.max,
				right.max), maxProfit);
	}

	public static class ThreeVal {
		public int max;
		public int min;
		public int profitMax;

		public ThreeVal() {

		}

		public ThreeVal(int min, int max, int profitMax) {
			this.max = max;
			this.min = min;
			this.profitMax = profitMax;

		}

		@Override
		public String toString() {
			return "profit:" + profitMax + ", buy:" + min + ", sell:" + max;
		}
	}

}
