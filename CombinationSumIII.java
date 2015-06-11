import java.util.List;
import java.util.ArrayList;

public class CombinationSumIII{
	public List<List<Integer>> combinationSum3(int k, int n){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		int[] candidates = {1,2,3,4,5,6,7,8,9};
		ArrayList<Integer> path = new ArrayList<Integer>();
		combinationSumRe(candidates, n, 0, k, path, res);
		return res;
	}
	public void combinationSumRe(int[] candidates, int target, int start, int k, ArrayList<Integer> path, List<List<Integer>> res){
		if(target == 0 && path.size() == k){
			res.add(new ArrayList<Integer>(path));
			return;
		}
		for(int i = start; i < candidates.length && candidates[i] <= target; ++i){
			if(path.size() == k) continue;
			path.add(candidates[i]);
			combinationSumRe(candidates, target-candidates[i], i+1, k, path, res);
			path.remove(path.size()-1);
		}
	}
}