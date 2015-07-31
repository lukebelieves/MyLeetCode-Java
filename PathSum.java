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

public class PathSum{
	public boolean hasPathSum(TreeNode root, int sum){
		if(root==null) return false;
		if(root.left==null && root.right==null && root.val==sum){
			return true;
		}
		boolean leftSign = hasPathSum(root.left, sum-root.val);
		boolean rightSign = hasPathSum(root.right, sum-root.val);
		if(leftSign || rightSign) return true;
		else return false;
	}
}