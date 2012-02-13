package sorts;

import static org.junit.Assert.*;
import org.junit.Test;

public class InsertionSortTest {

	@Test
	public void testInsertionSort() {
		int[] unsortedArr = new int[] { 3, 5, 1, 9, 4, 8, 6 };
		InsertionSort.sort(unsortedArr);
		assertArrayEquals(new int[] { 1, 3, 4, 5, 6, 8, 9 }, unsortedArr);

	}

	@Test
	public void testInsert() {
		int[] sortedArr = new int[] { 1, 2, 3, 4, 5, 7, 8, 9, 0 };
		InsertionSort.insert(sortedArr, 6);
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, sortedArr);

	}

}
