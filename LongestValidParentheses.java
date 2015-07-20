public class LongestValidParentheses{
	public int longestValidParentheses(String s){
		int N = s.length();
		if(N<=1) return 0;
		int[] dp = new int[N];	//dp[i]: the length of the longest valid parentheses ending at position i
		dp[0] = 0;
		int res = 0;
		for(int i=1;i<N;++i){
			if(s.charAt(i)=='('){
				dp[i] = 0;
			}
			else{
				if(s.charAt(i-1)=='('){
					dp[i] = (i-2>=0) ? dp[i-2]+2 : 2;
				}
				else{
					if(i-1-dp[i-1]>=0 && s.charAt(i-1-dp[i-1])=='('){
						dp[i] = (i-2-dp[i-1]>=0) ? dp[i-1]+2+dp[i-2-dp[i-1]] : dp[i-1]+2;
					}
					else{
						dp[i] = 0;
					}
				}
			}
			res = Math.max(res, dp[i]);
		}
		return res;
	}
}