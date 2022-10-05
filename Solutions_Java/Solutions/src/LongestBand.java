import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestBand {

	private int getLengthOfLongestBand(int[] arr) {
		int result = 0;
		// HashSet<>(Arrays.stream(arr).boxed().collect(Collectors.toSet()));
		Set<Integer> elements = new HashSet<>();
		for (int num : arr) {
			elements.add(num);
		}
		for (int num : arr) {
			int count = 1;
			int index = num;
			// check if it is Head
			if (!elements.contains(num - 1)) {
				while (elements.contains(index + 1)) {
					count++;
					index++;
				}
				result = Math.max(result, count);
			}
		}
		return result;
	}

	/*
	 * Given an array containing N integers, find the length of longest band.
	 * 
	 * A band is defined as a subsequence which can be re-ordered in such a manner
	 * all elements appear consecutive (i.e. with absolute difference of 1 between
	 * neighbouring elements)
	 * 
	 * Longest band is a band (subsequence) which contains maximum integers.
	 */
	public static void main() {
		System.out.println("Solution");
		int result = (new LongestBand())
				.getLengthOfLongestBand(new int[] { 1, 9, 3, 0, 18, 5, 2, 4, 10, 7, 12, 6 });
		if (result != 0) {
			System.out.println("Length of Longest Band : " + result);
		}
	}
}
