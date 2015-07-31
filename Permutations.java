import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Permutations{
	public List<List<Integer>> permute(int[] nums){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> path = new ArrayList<Integer>();
		boolean[] free = new boolean[nums.length];
		Arrays.fill(free, true);
		permuteRe(nums, free, path, res);
		return res;
	}
	public void permuteRe(int[] nums, boolean[] free, List<Integer> path, List<List<Integer>> res){
		if(path.size()==nums.length){
			ArrayList<Integer> temp = new ArrayList<Integer>(path);
			res.add(temp);
			return;
		}
		for(int i=0;i<nums.length;++i){
			if(free[i]==true){
				free[i] = false;
				path.add(nums[i]);
				permuteRe(nums, free, path, res);
				path.remove(path.size()-1);
				free[i] = true;
			}
		}
	}
}