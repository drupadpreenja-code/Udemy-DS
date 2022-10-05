public class MountainArray {
	private int getHighestMountainLength(int[] arr) {
		int result = 0;
		for (int i = 1; i < arr.length - 1;) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				int count = 1;
				int j = i;
				// backwards
				while (j > 0 && arr[j] > arr[j - 1]) {
					j--;
					count++;
				}
				// forward
				while (i < arr.length - 1 && arr[i] > arr[i + 1]) {
					i++;
					count++;
				}
				result = Math.max(result, count);
			} else {
				i++;
			}
		}
		return result;
	}

	/*
	 * Write a function that takes input an array of distinct integers, and return
	 * the length of the highest mountain.
	 * 
	 * A mountain is defined as adjacent inetgers that are strictly increasing until
	 * they reach a peak, at which it becomes strictly decreasing.
	 * 
	 * At least 3 numbers are required to form a mountain.
	 */
	public static void main() {
		System.out.println("Solution");
		int result = (new MountainArray())
				.getHighestMountainLength(new int[] { 5, 6, 1, 2, 3, 4, 5, 4, 3, 2, 0, 1, 2, 3, -2, 4 });
		if (result == 0) {
			System.out.println("No Mountain exist !");
		} else {
			System.out.println("Length : " + result);
		}
	}
}
