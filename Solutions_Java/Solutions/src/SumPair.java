import java.util.HashSet;
import java.util.Set;

public class SumPair {

	private int[] getpair(int[] arr, int sum) {
		int[] result = new int[2];
		Set<Integer> arrSet = new HashSet<>();
		for (int num : arr) {
			if (arrSet.contains(num)) {
				result = new int[] { sum - num, num };
				return result;
			}
			arrSet.add(sum - num);
		}
		return null;
	}

	/*
	 * Given an array ontaing N integers, and a number S denoting a target sum.
	 * 
	 * Find two distinct integers that can pair up to form target sum. Let us
	 * assume there will only be one such pair.
	 */
	public static void main() {
		System.out.println("Solution");
		int[] result = (new SumPair()).getpair(new int[] { 10, 5, 2, 3, -6, 9, 11 }, 4);
		if (result != null) {
			for (int i : result) {
				System.out.println(i);
			}
		} else {
			System.out.println("No Such Pair Exist!");
		}
	}
}
