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
