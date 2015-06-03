import java.util.Collections;

public class BinaryTreeLevelOrderTraversalII{
	public List<List<Integer>> levelOrderBottom(TreeNode root){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(root == null) return res;
		levelOrderBottomRe(root, 0, res);
		Collections.reverse(res);
		return res;
	}
	public void levelOrderBottomRe(TreeNode root, int level, List<List<Integer>> res){
		if(root == null) return;
		if(level == res.size()){
			res.add(new ArrayList<Integer>());
		}
		res.get(level).add(root.val);
		levelOrderBottomRe(root.left, level+1, res);
		levelOrderBottomRe(root.right, level+1, res);
	}
}