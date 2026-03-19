class MinimumInsertionsToMakeStringPallindrome1312 {

    static int[][] dp;

    public static int largestPallindromeSubsequence(String s, int n){
        String s1 = s;
        String s2 = new StringBuilder(s).reverse().toString();

        for(int i =1;i<n+1;i++){
            for(int j=1; j<n+1; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[n][n];
    }

    public static int minInsertions(String s) {
        int n = s.length();
        dp = new int[n+1][n+1];
        int lpsLength = largestPallindromeSubsequence(s,n);
        return n-lpsLength;
    }   
    
    public static void main(String args[]){
        String s = "leetcode";
        System.out.println(minInsertions(s));
    }
}