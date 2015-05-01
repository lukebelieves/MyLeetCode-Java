class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){
		val = x;
		left = null;
		right = null;
	}
}

public class BalancedBinaryTree{
	public boolean isBalanced(TreeNode root){
		if(root==null) return true;
		return dfsHeight(root)>-1;
	}
	public int dfsHeight(TreeNode root){
		if(root==null) return 0;
		int left = dfsHeight(root.left);
		int right = dfsHeight(root.right);
		if(left==-1 || right==-1) return -1;
		if(Math.abs(left-right)>1) return -1;
		return Math.max(left, right)+1;
	}
}