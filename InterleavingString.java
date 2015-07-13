//���˻�˼ά��l1=1,l2=1��DP
//dp[i][j]: s1[0...i-1], s2[0...j-1], s3[0...i+j-1]

public class InterleavingString{
	public boolean isInterleave(String s1, String s2, String s3){
		int l1 = s1.length();
		int l2 = s2.length();
		int l3 = s3.length();
		if(l1==0) return s2.compareTo(s3)==0;
		if(l2==0) return s1.compareTo(s3)==0;
		if(l1+l2!=l3) return false;
		boolean[][] dp = new boolean[l1+1][l2+1];
		dp[0][0] = true;
		for(int i = 1; i<=l1; ++i){
			dp[i][0] = dp[i-1][0] && s1.charAt(i-1)==s3.charAt(i-1);
		}
		for(int j = 1; j<=l2; ++j){
			dp[0][j] = dp[0][j-1] && s2.charAt(j-1)==s3.charAt(j-1);
		}
		for(int i = 1; i<=l1; ++i){
			for(int j = 1; j<=l2; ++j){
				if(s1.charAt(i-1)==s3.charAt(i+j-1)){
					dp[i][j] = dp[i-1][j];
				}
				if(s2.charAt(j-1)==s3.charAt(i+j-1)){
					dp[i][j] = dp[i][j] || dp[i][j-1];
				}
			}
		}
		return dp[l1][l2];
	}
}