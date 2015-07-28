public class PalindromePartitioningII{
	public int minCut(String s){
		int N = s.length();
		boolean[][] isP = new boolean[N][N];
		int[] dp = new int[N+1];	//dp[i]: min #cut of s[i...N-1]
		dp[N] = -1;
		for(int i=N-1;i>=0;i--){
			dp[i] = N-i-1;
			for(int j=i;j<N;++j){
				if(j==i) isP[i][j] = true;
				else if(j==i+1) isP[i][j] = (s.charAt(i)==s.charAt(j));
				else{
					if(s.charAt(i)==s.charAt(j)) isP[i][j] = isP[i+1][j-1];
					else isP[i][j] = false;
				}
				if(isP[i][j]==true){
					dp[i] = Math.min(dp[i], 1+dp[j+1]);
				}
			}
		}
		return dp[0];
	}
}