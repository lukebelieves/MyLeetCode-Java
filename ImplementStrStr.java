public class ImplementStrStr{
	//KMP
	public int strStr(String haystack, String needle){
		int n = haystack.length();
		int m = needle.length();
		if(m == 0) return 0;
		if(n == 0 || n < m) return -1;
		int[] next = new int[m];
		getNext(needle, next);
		int k = 0;
		for(int i = 0; i < n; ++i){
			while(k > 0 && needle.charAt(k) != haystack.charAt(i)){
				k = next[k-1];
			}
			if(needle.charAt(k) == haystack.charAt(i)){
				k++;
			}
			if(k == m){
				return i-m+1;
			}
		}
		return -1;
	}
	public void getNext(String pattern, int[] next){
		int m = pattern.length();
		next[0] = 0;
		int k = 0;
		for(int i = 1; i < m; ++i){
			while(k > 0 && pattern.charAt(k) != pattern.charAt(i)){
				k = next[k-1];
			}
			if(pattern.charAt(k) == pattern.charAt(i)){
				k++;
			}
			next[i] = k;
		}
	}
	
	public static void main(String[] args){
		ImplementStrStr obj = new ImplementStrStr();
		String haystack = "a";
		String needle = "a";
		System.out.println(obj.strStr(haystack, needle));
	}
}