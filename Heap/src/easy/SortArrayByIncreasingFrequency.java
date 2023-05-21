package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;

public class SortArrayByIncreasingFrequency {
	public int[] frequencySort(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (Integer num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		Queue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());
		minHeap.addAll(map.entrySet());

		int[] res = new int[nums.length];
		int j = 0;
		while (!minHeap.isEmpty()) {
			Entry<Integer, Integer> entry = minHeap.poll();
			Integer key = entry.getKey();
			Integer count = entry.getValue();
			for (int i = 0; i < count; i++) {
				res[j++] = key;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		SortArrayByIncreasingFrequency heap = new SortArrayByIncreasingFrequency();
		int[] arr = { 1, 1, 2, 2, 2, 3 };
		int[] res = heap.frequencySort(arr);
		System.out.println(Arrays.toString(res));
	}
}