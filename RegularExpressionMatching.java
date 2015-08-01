public class RegularExpressionMatching{
	public boolean isMatch(String s, String p){
		if(p.length()==0) return s.length()==0;
		int sLen = s.length(), pLen = p.length();
		boolean[][] dp = new boolean[sLen+1][pLen+1];
		dp[0][0] = true;
		for(int i=1;i<=sLen;++i){
			dp[i][0] = false;
		}
		for(int j=1;j<=pLen;++j){
			if(j==1) dp[0][j] = false;
			else dp[0][j] = p.charAt(j-1)=='*' && dp[0][j-2];
		}
		for(int i=1;i<=sLen;++i){
			for(int j=1;j<=pLen;++j){
				if(p.charAt(j-1)=='*'){
					dp[i][j] = dp[i][j-2] || ((s.charAt(i-1)==p.charAt(j-2) || p.charAt(j-2)=='.') && dp[i-1][j]);
				}
				else{
					dp[i][j] = (s.charAt(i-1)==p.charAt(j-1) || p.charAt(j-1)=='.') && dp[i-1][j-1];
				}
			}
		}
		return dp[sLen][pLen];
	}
}