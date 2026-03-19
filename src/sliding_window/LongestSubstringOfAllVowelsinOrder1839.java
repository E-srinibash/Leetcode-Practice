package sliding_window;

public class LongestSubstringOfAllVowelsinOrder1839 {
	public static int longestBeautifulSubstring(String word) {
        int len = 1;
        int unique = 1;
        int n = word.length();
        int res = 0;
        
        for(int j=0;j<n-1;j++){
        	char charAtj = word.charAt(j+1);
        	if(charAtj == word.charAt(j)) {
        		len++;
        	}
        	else if(charAtj > word.charAt(j)) {
        			unique++;
        			len++;
        	}
        	else {
        		len = 1;
        		unique = 1;
        	}
        	if(unique == 5) {
        		res = Math.max(len,res);
        	}
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestBeautifulSubstring("aeiaaioaaaaeiiiiouuuooaauuaeiu"));
	}

}
