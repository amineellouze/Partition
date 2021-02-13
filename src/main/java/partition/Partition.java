package partition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import partition.exception.PartitionException;



public class Partition {
	
	/**
	 * This method allows to split a list to sublist where each sublist has at most "size" elements.
	 * @author Amine ELLOUZE
	 * 
	 * @param list : list to split
	 * @param size : size of the sub lists
	 *
	 */
	public static List<int[]> partition(int[] list, int size) throws PartitionException {

		if (size <= 0) {
			throw new PartitionException("Size should be greater or equal to 1");
		}

		if (list == null || list.length == 0) {
			throw new PartitionException("List should not be empty or null");
		}

		List<int[]> result = new ArrayList<int[]>();

		int len = list.length;

		for (int i = 0; i < len - size + 1; i += size) {
			result.add(Arrays.copyOfRange(list, i, i + size));
		}

		if (len % size != 0) {
			result.add(Arrays.copyOfRange(list, len - len % size, len));
		}
		return result;
	}

}
