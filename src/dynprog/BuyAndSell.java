/**
 * 
 */
package dynprog;

/**
 * @author 01
 * 
 */
public class BuyAndSell {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int out[] = buyAndSell(new int[] { 10, 7 }, 0, 2);
		System.out.println("Buy: " + out[0] + ", Sell: " + out[1]
				+ ", Profit: " + out[2]);

	}

	public static int[] buyAndSell(int[] arr, int low, int high) {
		int min = Integer.MAX_VALUE;
		int minIndex = 0, maxIndex = 1;
		int profit = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				minIndex = i;
			}
			if (arr[i] - min > profit) {
				profit = arr[i] - min;
				maxIndex = i;
			}
		}
		return new int[] { arr[minIndex], arr[maxIndex], profit };

	}
}
