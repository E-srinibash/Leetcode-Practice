package dynamic_programming;

// LEETCODE PROBLEM 583
 
public class DeleteOperationforTwoStrings583 {
	static int[][] dp;

	public static int lcs(String s1, String s2, int n, int m) {
		dp = new int[n + 1][m + 1];
		for (int i = 0; i < n + 1; i++) {
			for (int j = 0; j < m + 1; j++) {
				if (i == 0 || j == 0) {
					dp[i][j] = 0;
				} else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
				}
			}
		}
		return dp[n][m];
	}

	public static int minDistance(String word1, String word2) {
		int n1 = word1.length();
		int n2 = word2.length();
		int commonLength = lcs(word1, word2, n1, n2);
		return Math.abs(2 * commonLength - n1 - n2);
	}

	public static void main(String[] args) {
		String word1 = "leetcode";
		String word2 = "etco";

		System.out.println(minDistance(word1,word2));
	}

}
