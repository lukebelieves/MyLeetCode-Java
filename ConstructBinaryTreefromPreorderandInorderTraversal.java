public class ConstructBinaryTreefromPreorderandInorderTraversal{
	public TreeNode buildTree(int[] preorder, int[] inorder){
		if(preorder.length == 0 || inorder.length == 0 || preorder.length != inorder.length) return null;
		return buildTreeRe(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
	}
	public TreeNode buildTreeRe(int[] preorder, int s1, int e1, int[] inorder, int s2, int e2){
		if(s1 > e1) return null;
		if(s1 == e1) return new TreeNode(preorder[s1]);
		int j = -1;
		for(int i = s2; i <= e2; ++i){
			if(inorder[i] == preorder[s1]){
				j = i;
				break;
			}
		}
		int left_len = j - s2;
		TreeNode root = new TreeNode(preorder[s1]);
		root.left = buildTreeRe(preorder, s1+1, s1+left_len, inorder, s2, j-1);
		root.right = buildTreeRe(preorder, s1+left_len+1, e1, inorder, j+1, e2);
		return root;
	}
}