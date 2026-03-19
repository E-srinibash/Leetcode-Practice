public class LongestRepeatingSubsequence{
    static int[][] dp;
    public static int lcs(String s1,String s2, int n){
        for(int i = 0;i<n+1;i++){
            for(int j =0;j<n+1;j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }
            }
        }
        for(int i =1;i<n+1;i++){
            for(int j =1;j<n+1;j++){
            if(s1.charAt(i-1) == s2.charAt(j-1) && i != j){
                dp[i][j] = dp[i-1][j-1] + 1;
            }
            else{
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
            }        
        }
        return dp[n][n];
    }
    public static int longestRepeatingSubsequence(String s) {
        // code here
        String s1 = new String(s);
        String s2 = new String(s);
        int n = s.length();
        dp = new int[n+1][n+1];
        return lcs(s1,s2,n);
    }

    public static void main(String args[]){
        String s = "aabebcdd";
        System.out.println(longestRepeatingSubsequence(s));
    }
}