package dynprog;

/**
 * 
 */

/**
 * @author dkz
 * 
 */
public class Benchmark {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		benchmarkMethod();

	}

	public static void benchmarkMethod() {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			int out[] = BuyAndSell.buyAndSell(new int[] { 3, 4, 5, 1, 2, 5, 7,
					80, 100 }, 0, 8);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime)
				+ "ms");
	}
}
