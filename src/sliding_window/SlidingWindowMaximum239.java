package sliding_window;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum239 {
	    public static int[] maxSlidingWindow(int[] nums, int k) {

	        Deque<Integer> dq = new ArrayDeque<>();
	        int n = nums.length;
	        int[] result = new int[n-k+1];
	        int i = 0;

	        for(int j = 0; j < n; j++){

	            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[j]){
	                dq.pollLast();
	            }

	            dq.offerLast(j);

	            if(dq.peekFirst() <= j-k){
	                dq.pollFirst();
	            }

	            if(j >= k-1){
	                result[i++] = nums[dq.peekFirst()];
	            }
	        }

	        return result;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] nums = new int[] {1,3,-1,-3,5,3,6,7};
		 int k = 3;
		 
		 for(int item : maxSlidingWindow(nums, k)) {
			 System.out.println(item);
		 };		 
	}

}
