import java.util.List;
import java.util.ArrayList;
import java.util.Stack;
public class BinaryTreePostorderTraversal{
	public List<Integer> postorderTraversal(TreeNode root){
		List<Integer> res = new ArrayList<Integer>();
		if(root == null) return res;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode cur = root;
		TreeNode pre = null;
		while(stack.isEmpty() == false || cur != null){
			if(cur != null){
				stack.push(cur);
				cur = cur.left;
			}
			else{
				TreeNode peak = stack.peek();
				if(peak.right != null && pre != peak.right){
					cur = peak.right;
				}
				else{
					res.add(peak.val);
					stack.pop();
					pre = peak;
				}
			}
		}
		return res;
	}
}