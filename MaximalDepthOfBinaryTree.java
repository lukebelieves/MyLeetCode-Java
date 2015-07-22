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

public class MaximalDepthOfBinaryTree{
	public int maxDepth(TreeNode root){
		return maxDepthRe(root);
	}
	public int maxDepthRe(TreeNode node){
		if(node==null) return 0;
		return Math.max(maxDepthRe(node.left), maxDepthRe(node.right))+1;
	}
}