public class DecodeWays{
	public int numDecodings(String s){
		int n = s.length();
		if(n == 0) return 0;
		int[] memo = new int[n+1];
		memo[n] = 1;
		memo[n-1] = s.charAt(n-1) == '0' ? 0 : 1;
		for(int i = n-2; i >= 0; --i){
			if(s.charAt(i) == '0'){
				memo[i] = 0;
				continue;
			}
			int val = (s.charAt(i)-'0')*10 + s.charAt(i+1)-'0';
			if(val <= 26){
				memo[i] = memo[i+1] + memo[i+2];
			}
			else{
				memo[i] = memo[i+1];
			}
		}
		return memo[0];
	}
}