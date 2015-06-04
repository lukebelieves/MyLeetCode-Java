public class BinaryTreeMaximumPathSum{
	public int maxPathSum(TreeNode root){
		int[] res = new int[1];
		res[0] = Integer.MIN_VALUE;
		maxPathDown(root, res);
		return res[0];
	}
	int maxPathDown(TreeNode root, int[] res){
		if(root == null) return 0;
		int left = maxPathDown(root.left, res);
		int right = maxPathDown(root.right, res);
		res[0] = Math.max(res[0], root.val+Math.max(0, left)+Math.max(0, right));
		return Math.max(root.val, root.val+Math.max(left, right));
	}
}