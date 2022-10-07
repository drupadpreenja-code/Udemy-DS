import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinSwaps {
	private int getMinimumSwaps(int[] arr) {
		int result = 0;
		Map<Integer, Integer> sortedIndex = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			sortedIndex.put(arr[i], i);
		}
		Boolean[] visited = new Boolean[arr.length];
		Arrays.fill(visited, Boolean.FALSE);

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			if (visited[i] || i == sortedIndex.get(arr[i])) {
				continue;
			}

			int node = i;
			int cycle = 0;
			while (!visited[node]) {
				visited[node] = true;
				node = sortedIndex.get(arr[node]);
				cycle++;
			}
			result += (cycle - 1);
		}
		return result;
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
