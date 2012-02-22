/**
 * 
 */
package dynprog;

/**
 * @author 01
 * 
 */
public class BillBoards {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maxRevenue(new int[] { 0, 1, 2, 8, 10 },
				new int[] { 0, 10, 15, 50, 20 });
		maxRevenueLinear(new int[] { 0, 1, 2, 8, 10 }, new int[] { 0, 10, 15,
				50, 20 });
	}

	public static void maxRevenue(int[] x, int[] r) {
		int[] T = new int[x.length];

		for (int i = 1; i < x.length; i++) {

			int max = r[i];
			for (int j = 1; j < i; j++) {
				if ((max < (T[j] + r[i])) && ((x[i] - x[j]) > 5))
					max = T[j] + r[i];
				else if (max < T[j])
					max = T[j];
			}
			T[i] = max;
		}
		System.out.println(T[x.length - 1]);

	}

	public static void maxRevenueLinear(int[] x, int[] r) {
		int[] L = new int[x.length];
		int[] T = new int[x.length];
		int j = 0;

		for (int i = 0; i < x.length; i++) {
			if (x[i] - x[j] > 5) {
				while (x[i] - x[j + 1] > 5)
					j++;

			}
			L[i] = j;
		}

		for (int i = 1; i < x.length; i++) {
			int max = r[i] + T[L[i]];
			if (max < T[i - 1])
				max = T[i - 1];
			T[i] = max;
		}
		System.out.println(T[x.length - 1]);
	}
}
