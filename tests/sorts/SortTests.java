package sorts;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SortTests {

	@Test
	public void testInsertionSort() {
		assertArrayEquals(sortedArray(), InsertionSort.sort(unsortedArray()));

	}

	@Test
	public void testInsert() {
		int[] sortedArr = new int[] { 1, 2, 3, 4, 5, 7, 8, 9, 0 };
		InsertionSort.insert(sortedArr, 6);
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, sortedArr);

	}

	@Test
	public void testCountingSort() {
		int[] unsortedArr = new int[] { 1, 2, 3, 4, 2, 3, 4, 1, 3 };
		int[] sortedArr = new int[] { 1, 2, 3, 4, 2, 3, 4, 1, 3 };
		Arrays.sort(sortedArr);

		assertArrayEquals(sortedArr, CountingSort.sort(unsortedArr, 5));
	}

	@Test
	public void testMergeSort() {
		assertArrayEquals(sortedArray(), MergeSort.sort(unsortedArray()));

	}

	private int[] unsortedArray() {
		return new int[] { 3, 5, 1, 9, 4, 8, 6 };
	}

	private int[] sortedArray() {
		int[] arr = unsortedArray();
		Arrays.sort(arr);
		return arr;

	}

}
