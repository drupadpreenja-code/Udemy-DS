import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletsDistinctOrdered {

	private List<int[]> getTriplets(int arr[], int sum) {
		Arrays.sort(arr);
		List<int[]> result = new ArrayList<int[]>();

		for (int i = 0; i < arr.length - 2; i++) {
			int j = i + 1;
			int k = arr.length - 1;
			while (j < k) {
				int newSum = arr[i];
				newSum += arr[j];
				newSum += arr[k];
				if (newSum == sum) {
					result.add(new int[] { arr[i], arr[j], arr[k] });
					j++;
					k--;
				} else if (newSum < sum) {
					j++;
				} else {
					k--;
				}
			}
		}

		return result;
	}

	public static void main() {
		System.out.println("Solution");
		List<int[]> result = (new TripletsDistinctOrdered())
				.getTriplets(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 15 }, 18);
		if (result == null || result.size() == 0 || result.get(0).length == 0) {
			System.out.println("No such triplet exist!");
			return;
		}
		for (int[] is : result) {
			for (Integer is2 : is) {
				System.out.print(is2 + ",");
			}
			System.out.println();
		}
	}
}
