import java.util.List;
import java.util.ArrayList;

public class Combinations{
	public List<List<Integer>> combine(int n, int k){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		ArrayList<Integer> path = new ArrayList<Integer>();
		combineRe(n, 1, k, path, res);
		return res;
	}
	public void combineRe(int n, int start, int k, ArrayList<Integer> path, List<List<Integer>> res){
		if(path.size() == k){
			res.add(new ArrayList<Integer>(path));
			return;
		}
		for(int i = start; i <= n; ++i){
			path.add(i);
			combineRe(n, i+1, k, path, res);
			path.remove(path.size()-1);
		}
	}
}