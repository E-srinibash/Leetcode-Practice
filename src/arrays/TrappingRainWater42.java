package arrays;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TrappingRainWater42 {
	public static int trap(int[] height) {
		int totalWater = 0;
		int right = height.length - 1;
		int left = 0;
		int leftMax = 0;
		int rightMax = 0;

		while (left < right) {
			if (height[left] < height[right]) {
				leftMax = Math.max(leftMax, height[left]);
				totalWater += leftMax - height[left];
				left++;
			} else {
				rightMax = Math.max(rightMax, height[right]);
				totalWater += rightMax - height[right];
				right--;
			}
		}
		return totalWater;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		int result = trap(arr);
		System.out.println(result);
	}

}
