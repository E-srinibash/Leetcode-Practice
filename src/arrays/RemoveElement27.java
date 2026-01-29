package arrays;

//LEETCODE PROBLEM 27

public class RemoveElement27 {
	static int[] nums;

	public static int removeElement(int[] nums, int val) {
		int i = 0;
		int j = 0;
		while (j < nums.length) {
			if (nums[j] == val) {
				j++;
			} else {
				nums[i] = nums[j];
				i++;
				j++;
			}
		}
		return i;
	}

	public static void main(String[] args) {
		nums = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;
		int result = removeElement(nums, val);
		for (int i = 0; i < result; i++) {
			System.out.println(nums[i]);
		}
	}
}