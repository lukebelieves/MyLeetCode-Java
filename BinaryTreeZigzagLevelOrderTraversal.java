import java.util.List;
import java.util.ArrayList;

public class BinaryTreeZigzagLevelOrderTraversal{
	public List<List<Integer>> zigzagLevelOrder(TreeNode root){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(root == null) return res;
		zigzagLevelOrderRe(root, 0, res);
		return res;
	}
	public void zigzagLevelOrderRe(TreeNode root, int level, List<List<Integer>> res){
		if(root == null) return;
		if(level == res.size()){
			res.add(new ArrayList<Integer>());
		}
		if(level % 2 == 0){
			res.get(level).add(root.val);
		}
		else{
			res.get(level).add(0, root.val);
		}
		zigzagLevelOrderRe(root.left, level+1, res);
		zigzagLevelOrderRe(root.right, level+1, res);
	}
}