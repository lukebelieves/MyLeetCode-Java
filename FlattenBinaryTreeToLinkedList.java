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

public class FlattenBinaryTreeToLinkedList{
	public void flatten(TreeNode root){
		flattenRe(root, null);
	}
	public TreeNode flattenRe(TreeNode root, TreeNode tail){
		if(root == null) return tail;
		root.right = flattenRe(root.left, flattenRe(root.right, tail));
		root.left = null;
		return root;
	}
}