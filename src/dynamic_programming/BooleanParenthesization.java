package dynamic_programming;

import java.util.HashMap;
import java.util.Map;

public class BooleanParenthesization {
	
	    static Map<String,Integer> mp = new HashMap<>();
	    static int solve(String s, int i,int j, boolean isTrue){
	        if(i>j){
	            return 0;
	        }
	        if(i == j){
	            if(isTrue ){
	                return (s.charAt(i) == 'T') ? 1 : 0;
	            }
	            else{
	                return (s.charAt(i) == 'F') ? 1 : 0;
	            }
	        }
	        
	        String tempString = i + " " + j + " " + isTrue;;
	        if(mp.containsKey(tempString)){
	            return mp.get(tempString);
	        }
	        
	        Integer ans = 0;
	        for(int k =i+1;k<=j-1;k=k+2 ){
	        int LT = solve(s,i,k-1,true);
	        int LF = solve(s,i,k-1,false);
	        int RT = solve(s,k+1,j,true);
	        int RF = solve(s,k+1,j,false);
	        
	        char op = s.charAt(k);
	        
	        if( op == '&'){
	            if(isTrue = true){
	                ans = ans + LT*RT ; 
	            }
	            else{
	                ans = ans + (LF*RF) + (LF*RT) + (LT*RF);
	            }
	        }
	        else if( op == '|'){
	            if(isTrue = true){
	                ans = ans + (LT*RT) + (LF*RT) + (LT*RF); 
	            }
	            else{
	                ans = ans + (LF*RF) ;
	            }
	        }
	        else if( op == '^'){
	            if(isTrue = true){
	                ans = ans + (LF*RT) + (LT*RF); 
	            }
	            else{
	                ans = ans + (LF*RF) + (LT*RT) ;
	            }
	        }
	    }
	        mp.put(tempString,ans);
	        return ans;
	    }
	    static int countWays(String s) {
	        // code here
	        int i = 0;
	        int j = s.length()-1;
	        mp.clear();
	        return solve(s,i,j,true);
	    }
	    public static void main(String[] args) {
	        String s = "T|T&F^T";
	        System.out.println(countWays(s));
	    }
	}

