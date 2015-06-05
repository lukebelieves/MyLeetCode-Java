import java.util.List;
import java.util.Stack;
import java.util.ArrayList;

public class BinaryTreePreorderTraversal{
	public List<Integer> preorderTraversal(TreeNode root){
		List<Integer> res = new ArrayList<Integer>();
		if(root == null) return res;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode cur = root;
		while(stack.isEmpty() == false || cur != null){
			if(cur != null){
				res.add(cur.val);
				stack.push(cur);
				cur = cur.left;
			}
			else{
				cur = stack.pop();
				cur = cur.right;
			}
		}
		return res;
	}
}