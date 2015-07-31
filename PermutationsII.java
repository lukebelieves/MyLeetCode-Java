import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class PermutationsII{
	public List<List<Integer>> permuteUnique(int[] nums){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> path = new ArrayList<Integer>();
		boolean[] visited = new boolean[nums.length];
		Arrays.fill(visited, false);
		Arrays.sort(nums);
		permuteUniqueRe(nums, visited, path, res);
		return res;
	}
	public void permuteUniqueRe(int[] nums, boolean[] visited, List<Integer> path, List<List<Integer>> res){
		if(path.size()==nums.length){
			ArrayList<Integer> temp = new ArrayList<Integer>(path);
			res.add(temp);
			return;
		}
		for(int i=0;i<nums.length;++i){
			if(visited[i] || (i!=0 && nums[i-1]==nums[i] && visited[i-1])) continue;
			visited[i] = true;
			path.add(nums[i]);
			permuteUniqueRe(nums, visited, path, res);
			visited[i] = false;
			path.remove(path.size()-1);
		}
	}
}