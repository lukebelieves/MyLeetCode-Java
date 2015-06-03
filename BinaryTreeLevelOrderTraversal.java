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
public class BinaryTreeLevelOrderTraversal{
	public List<List<Integer>> levelOrder(TreeNode root){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(root == null) return res;
		levelOrderRe(root, 0, res);
		return res;
	}
	public void levelOrderRe(TreeNode root, int level, List<List<Integer>> res){
		if(root == null) return;
		if(level == res.size()){
			res.add(new ArrayList<Integer>());
		}
		res.get(level).add(root.val);
		levelOrderRe(root.left, level+1, res);
		levelOrderRe(root.right, level+1, res);
	}
}