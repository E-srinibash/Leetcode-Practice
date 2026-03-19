package sliding_window;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters3 {

	static Map<Character, Integer> mp = new HashMap<Character, Integer>();

	public static int lengthOfLongestSubstringWithoutRepeating(String s) {
		int i = 0;
		int max = 0;
		int n = s.length();
		for (int j = 0; j < n; j++) {

			char currChar = s.charAt(j);

			mp.put(currChar, mp.getOrDefault(currChar, 0) + 1);
			// comparing map size with window size
			if (mp.size() == j - i + 1) {
				max = Math.max(max, j - i + 1);
			} 
			// map size is less than window size means duplicate characters present
			else if (mp.size() < j - i + 1) {
				while (mp.size() < j - i + 1) {
					char charAtI = s.charAt(i);
					mp.put(charAtI, mp.get(charAtI) - 1);
					if (mp.get(charAtI) == 0) {
						mp.remove(charAtI);
					}
					i++;
				}

			}
		}
		return max;
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstringWithoutRepeating("bbbbb"));

	}

}
