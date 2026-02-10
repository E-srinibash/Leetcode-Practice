public class IsSubsequence392{ 
    public static boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        int i = 0;
        int j = 0;
        while(i<m && j<n){
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }
        return m == i; 
}
public static void main(String args[]){
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
}