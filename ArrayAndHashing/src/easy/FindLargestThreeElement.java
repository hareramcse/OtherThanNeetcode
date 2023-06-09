package easy;

class FindLargestThreeElement {
	private void print3largest(int arr[], int arr_size) {
		if (arr_size < 3) {
			System.out.print(" Invalid Input ");
			return;
		}

		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
		for (int i = 0; i < arr_size; i++) {
			if (arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			} else if (arr[i] > second) {
				third = second;
				second = arr[i];
			} else if (arr[i] > third)
				third = arr[i];
		}

		System.out.println("Three largest elements are " + first + " " + second + " " + third);
	}

	public static void main(String[] args) {
		FindLargestThreeElement array = new FindLargestThreeElement();
		int arr[] = { 12, 13, 1, 10, 34, 1 };
		int n = arr.length;
		array.print3largest(arr, n);
	}
}