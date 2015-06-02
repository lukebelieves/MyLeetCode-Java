import java.util.Stack;

/*class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){
		val = x;
		left = null;
		right = null;
	}
}
*/

public class BinarySearchTreeIterator{
	private TreeNode node;
	private Stack<TreeNode> stack;
	public BinarySearchTreeIterator(TreeNode root){
		node = root;
		stack = new Stack<TreeNode>();
	}
	public boolean hasNext(){
		if (node == null && stack.isEmpty()){
			return false;
		}
		else{
			return true;
		}
	}
	public int next(){
		if (node == null && stack.isEmpty()) return 0;
		while(node != null){
			stack.push(node);
			node = node.left;
		}
		int res = 0;
		node = stack.pop();
		res = node.val;
		node = node.right;
		return res;
	}
}