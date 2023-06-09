package easy;

import java.util.Arrays;

public class ReverseArray {
	private void reverse1(int arr[]) {
		int length = arr.length;
		int start = 0;
		int end = length - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	private void reverse2(int arr[], int start, int end) {
		if (start >= end)
			return;
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		reverse2(arr, start + 1, end - 1);
	}

	public static void main(String[] args) {
		ReverseArray array = new ReverseArray();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		array.reverse1(arr);
		System.out.println(Arrays.toString(arr));
		array.reverse2(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
}