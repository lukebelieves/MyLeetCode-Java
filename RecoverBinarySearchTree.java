import java.util.ArrayList;

/*class TreeNode{
	int val;
	TreeNode left, right;
	TreeNode(int x){
		val = x;
	}
}*/

public class RecoverBinarySearchTree{
	public void recoverTree(TreeNode root){
		if(root==null) return;
		ArrayList<TreeNode> inOrderPath = new ArrayList<TreeNode>();
		inOrderTraversal(root, inOrderPath);
		TreeNode first = null;
		TreeNode second = null;
		for(int i=1;i<inOrderPath.size();++i){
			if(inOrderPath.get(i-1).val < inOrderPath.get(i).val) continue;
			if(first==null) first = inOrderPath.get(i-1);
			second = inOrderPath.get(i);
		}
		int temp = first.val;
		first.val = second.val;
		second.val = temp;
	}
	public void inOrderTraversal(TreeNode root, ArrayList<TreeNode> inOrderPath){
		if(root==null) return;
		inOrderTraversal(root.left, inOrderPath);
		inOrderPath.add(root);
		inOrderTraversal(root.right, inOrderPath);
	}
}