import java.util.Stack;
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
public class BinaryTreeInorderTraversal{
	public List<Integer> inorderTraversal(TreeNode root){
		List<Integer> res = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode cur = root;
		while(stack.isEmpty() == false || cur != null){
			if(cur != null){
				stack.push(cur);
				cur = cur.left;
			}
			else{
				cur = stack.pop();
				res.add(cur.val);
				cur = cur.right;
			}
		}
		return res;
	}
}