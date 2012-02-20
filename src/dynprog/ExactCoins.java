/**
 * 
 */
package dynprog;

/**
 * @author 01
 * 
 */
public class ExactCoins {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exactChange(100, new int[] { 1, 5, 10 });
	}

	public static void exactChange(int num, int[] denoms) {
		int[][] arr = new int[num + 1][denoms.length];

		for (int i = 0; i < num + 1; i++) {
			for (int j = 0; j < denoms.length; j++) {
				arr[i][j] = i / denoms[j];
			}
		}

		int x = 0;
	}

}
