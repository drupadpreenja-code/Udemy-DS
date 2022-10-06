public class SubArraySort {

	private int[] getSubarrayIndexes(int[] arr) {
		int smallestNumberOutOfOrder = Integer.MAX_VALUE;
		int largestNumberOutOfOrder = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (checkOutOfOrder(arr, i)) {
				smallestNumberOutOfOrder = Math.min(smallestNumberOutOfOrder, arr[i]);
				largestNumberOutOfOrder = Math.max(largestNumberOutOfOrder, arr[i]);
			}
		}
		if (smallestNumberOutOfOrder != Integer.MAX_VALUE) {
			int left = 0;
			while (smallestNumberOutOfOrder >= arr[left]) {
				left++;
			}
			int right = arr.length - 1;
			while (largestNumberOutOfOrder <= arr[right]) {
				right--;
			}
			return new int[] { left, right };
		}
		return new int[] { -1, -1 };
	}

	private Boolean checkOutOfOrder(int[] arr, int i) {
		if (i == 0) {
			return arr[i] > arr[i + 1];
		} else if (i == arr.length - 1) {
			return arr[i] < arr[i - 1];
		} else {
			return arr[i] > arr[i + 1] || arr[i] < arr[i - 1];
		}
	}

	/*
	 * Given an array of size atleast 2, find the smallest sub array
	 * that needs to be sorted in place so that entire input array
	 * becomes sorted.
	 * 
	 * If the input array is already sorted then the function should
	 * return [-1, -1], otherwise return the start and end index of
	 * smallest subarray.
	 */
	public static void main() {
		System.out.println("Solution");
		int[] result = (new SubArraySort())
				.getSubarrayIndexes(new int[] { 1, 2, 3, 4, 5, 8, 6, 7, 9, 10, 11 });
		System.out.println("Result : [" + result[0] + ", " + result[1] + "]");
	}
}