package partition;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import partition.exception.PartitionException;

public class PartitionTest {

	@Test(expected = PartitionException.class)
	public void checkIfSizeIsNotGreaterThanZero() throws PartitionException {
		// Given
		int[] input = { 1, 2, 3, 4, 5 };
		int size = 0;

		// When
		Partition.partition(input, size);
	}

	@Test(expected = PartitionException.class)
	public void checkIfListIsNotEmpty() throws PartitionException {
		// Given
		int[] input = {};
		int size = 1;

		// When
		Partition.partition(input, size);
	}

	@Test(expected = PartitionException.class)
	public void checkIfListIsNotNull() throws PartitionException {
		// Given
		int[] input = null;
		int size = 1;

		// When
		Partition.partition(input, size);
	}

	@Test
	public void checkSizeOfSubArrays() throws PartitionException {
		// Given
		int[] input = { 1, 2, 3, 4, 5 };
		int size = 2;

		List<int[]> expectedResult = new ArrayList<>();
		int[] subArray1 = { 1, 2 };
		expectedResult.add(subArray1);
		int[] subArray2 = { 3, 4 };
		expectedResult.add(subArray2);
		int[] subArray3 = { 5 };
		expectedResult.add(subArray3);

		// When
		List<int[]> returned = Partition.partition(input, size);

		// Then
		assertEquals(expectedResult.size(), returned.size());
		for (int i = 0; i < returned.size(); i++) {
			assertEquals(expectedResult.get(i).length, returned.get(i).length);
		}

	}

	@Test
	public void checkSizeOfSubArrays2() throws PartitionException {
		// Given
		int[] input = { 1, 2, 3, 4, 5 };
		int size = 3;

		List<int[]> expectedResult = new ArrayList<>();
		int[] subArray1 = { 1, 2, 3 };
		expectedResult.add(subArray1);
		int[] subArray2 = { 4, 5 };
		expectedResult.add(subArray2);

		// When
		List<int[]> returned = Partition.partition(input, size);

		// Then
		assertEquals(expectedResult.size(), returned.size());
		for (int i = 0; i < returned.size(); i++) {
			assertEquals(expectedResult.get(i).length, returned.get(i).length);
		}

	}

	@Test
	public void checkSizeOfSubArrays3() throws PartitionException {
		// Given
		int[] input = { 1, 2, 3, 4, 5 };
		int size = 1;

		List<int[]> expectedResult = new ArrayList<>();
		int[] subArray1 = { 1 };
		expectedResult.add(subArray1);
		int[] subArray2 = { 2 };
		expectedResult.add(subArray2);
		int[] subArray3 = { 3 };
		expectedResult.add(subArray3);
		int[] subArray4 = { 4 };
		expectedResult.add(subArray4);
		int[] subArray5 = { 5 };
		expectedResult.add(subArray5);

		// When
		List<int[]> returned = Partition.partition(input, size);

		// Then
		assertEquals(expectedResult.size(), returned.size());
		for (int i = 0; i < returned.size(); i++) {
			assertEquals(expectedResult.get(i).length, returned.get(i).length);
		}

	}
}
