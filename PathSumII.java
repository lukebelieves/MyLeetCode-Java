import java.util.List;
import java.util.ArrayList;

/*class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){
		val = x;
		left = null;
		right = null;
	}
}*/

public class PathSumII{
	public List<List<Integer>> pathSum(TreeNode root, int sum){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> path = new ArrayList<Integer>();
		pathSumRe(root, sum, path, res);
		return res;
	}
	public void pathSumRe(TreeNode root, int sum, List<Integer> path, List<List<Integer>> res){
		if(root==null) return;
		path.add(root.val);
		if(root.left==null && root.right==null && root.val==sum){
			ArrayList<Integer> temp = new ArrayList<Integer>(path);
			res.add(temp);
		}
		pathSumRe(root.left, sum-root.val, path, res);
		pathSumRe(root.right, sum-root.val, path, res);
		path.remove(path.size()-1);
	}
}