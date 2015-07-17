import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters{
	public int lengthOfLongestSubstring(String s){
		int N = s.length();
		if(N==0) return 0;
		int res = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int left=0, right=0; right<N; ++right){
			if(map.containsKey(s.charAt(right))){
				left = Math.max(left, map.get(s.charAt(right))+1);
			}
			res = Math.max(res, right-left+1);	//ending with right
			map.put(s.charAt(right), right);
		}
		return res;
	}
}