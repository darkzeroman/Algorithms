/**
 * 
 */
package divideandconquer;

/**
 * @author dkz
 * 
 */
public class LeastNumCoins {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = leastNumCoins(new int[] { 1, 2, 3, 5 }, 100);
		System.out.println(num);
	}

	public static int leastNumCoins(int[] denCoins, int num) {
		int[] C = new int[num + 1];
		for (int i = 1; i < C.length; i++) {
			C[i] = C[i - denCoins[0]] + denCoins[0];
			for (int j = 1; j < denCoins.length && denCoins[j] <= i; j++) {
				int temp = C[i - denCoins[j]] + 1;
				if (C[i] > temp)
					C[i] = temp;
			}
		}
		return C[num];
		
	}
}
