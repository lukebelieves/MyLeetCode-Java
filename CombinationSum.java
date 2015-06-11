import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class CombinationSum{
	public List<List<Integer>> combinationSum(int[] candidates, int target){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Arrays.sort(candidates);
		ArrayList<Integer> path = new ArrayList<Integer>();
		combinationSumRe(candidates, target, 0, path, res);
		return res;
	}
	public void combinationSumRe(int[] candidates, int target, int start, ArrayList<Integer> path, List<List<Integer>> res){
		
	}
}