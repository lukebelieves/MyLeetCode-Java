import java.util.List;
import java.util.ArrayList;

public class PalindromePartitioning{
	public List<List<String>> partition(String s){
		List<List<String>> res = new ArrayList<List<String>>();
		int N = s.length();
		boolean[][] dp = new boolean[N][N];
		for(int i=N-1;i>=0;--i){
			for(int j=i;j<N;++j){
				if(j==i) dp[i][j] = true;
				else if(j==i+1) dp[i][j] = (s.charAt(i)==s.charAt(j));
				else{
					if(s.charAt(i)==s.charAt(j)) dp[i][j] = dp[i+1][j-1];
					else dp[i][j] = false;
				}
			}
		}
		ArrayList<String> path = new ArrayList<String>();
		dfs(s, dp, 0, path, res);
		return res;
	}
	public void dfs(String s, boolean[][] dp, int start, ArrayList<String> path, List<List<String>> res){
		if(start==s.length()){
			res.add(new ArrayList<String>(path));
			return;
		}
		for(int i=start;i<s.length();++i){
			if(dp[start][i]==true){
				path.add(s.substring(start, i+1));
				dfs(s, dp, i+1, path, res);
				path.remove(path.size()-1);
			}
		}
	}
}