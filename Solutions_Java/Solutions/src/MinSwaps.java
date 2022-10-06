public class MinSwaps {
	private int getMinimumSwaps(int[] arr) {
		// TODO
		return 0;
	}

	/*
	 * Given an array of size N, find the minimum number of swaps
	 * needed to make the array as sorted
	 */
	public static void main() {
		System.out.println("Solution");
		int result = (new MinSwaps())
				.getMinimumSwaps(new int[] { 10, 11, 5, 4, 3, 2, 1 });
		System.out.println("Minimum Swaps Required : " + result);
	}
}
