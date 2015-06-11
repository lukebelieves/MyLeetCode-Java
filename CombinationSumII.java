import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class CombinationSumII{
	public List<List<Integer>> combinationSum2(int[] candidates, int target){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Arrays.sort(candidates);
		ArrayList<Integer> path = new ArrayList<Integer>();
		combinationSumRe(candidates, target, 0, path, res);
		return res;
	}
	public void combinationSumRe(int[] candidates, int target, int start, ArrayList<Integer> path, List<List<Integer>> res){
		if(target == 0){
			res.add(new ArrayList<Integer>(path));
			return;
		}
		for(int i = start; i < candidates.length && candidates[i] <= target; ++i){
			if(i > start && candidates[i] == candidates[i-1]) continue;
			path.add(candidates[i]);
			combinationSumRe(candidates, target-candidates[i], i+1, path, res);
			path.remove(path.size()-1);
		}
	}
}