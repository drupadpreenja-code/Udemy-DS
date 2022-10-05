public class Rain {

	private int getTrapCapacity(int[] arr) {
		int result = 0;
		int[] leftArr = new int[arr.length];
		int[] rightArr = new int[arr.length];
		int left = arr[0];
		int right = arr[arr.length - 1];

		for (int i = 0; i < arr.length; i++) {
			if (left < arr[i]) {
				left = arr[i];
			}
			leftArr[i] = left;

			if (right < arr[arr.length - 1 - i]) {
				right = arr[arr.length - 1 - i];
			}
			rightArr[arr.length - 1 - i] = right;
		}

		for (int i = 0; i < arr.length; i++) {
			result += Math.min(rightArr[i], leftArr[i]) - arr[i];
		}
		return result;
	}

	/*
	 * Given n non-negative integers representing an elevation map where in
	 * the width of each bar is 1. Compute how much water it can trap after raining.
	 * |								_	
	 * |				_			|		|
	 * |			|		|		|		|
	 * |		_	|		|		|		|	_	
	 * |	|		|		|		|		|		|
	 * |	|		|		|		|		|		|
	 * |____|_______|_______|_______|_______|_______|_______________________________________
	 */
	public static void main() {
		System.out.println("Solution");
		int result = (new Rain())
				.getTrapCapacity(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 });
		if (result == 0) {
			System.out.println("No Water Can be Trapped !");
		} else {
			System.out.println("Trap Capacity : " + result);
		}
	}
}
