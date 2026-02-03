package dynamic_programming;

public class ClimbingStairs70 {
	public static int climbStairs(int n) {
        int[] dp = new int[n+1];
        for(int i=0;i<n+1;i++){
            if(i == 0 || i==1 ){
                dp[i] = 1;
            }
            else{
                dp[i] = dp[i-1] + dp[i-2];
            }
        }

        return dp[n];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stairs = 5;
		System.out.println(climbStairs(stairs));
	}

}
