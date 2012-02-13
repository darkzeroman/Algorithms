package sorts;

import static org.junit.Assert.*;

import org.junit.Test;

public class InsertionSortTest {

	@Test
	public void testInsertionSort() {
		int[] unsortedArr = new int[] { 3, 5, 1, 9, 4, 8, 6 };
		InsertionSort.insertionSort(unsortedArr);
		assertArrayEquals(new int[] { 1, 3, 4, 5, 6, 8, 9 }, unsortedArr);
	}

}
