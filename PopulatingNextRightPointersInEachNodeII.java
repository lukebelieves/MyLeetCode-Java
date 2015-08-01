/*class TreeLinkNode{
	int val;
	TreeLinkNode left, right, next;
	TreeLinkNode(int x){
		val = x;
	}
}*/

public class PopulatingNextRightPointersInEachNodeII{
	public void connect(TreeLinkNode root){
		if(root==null) return;
		TreeLinkNode dummy = new TreeLinkNode(-1);
		TreeLinkNode pre = dummy;
		TreeLinkNode cur = root;
		while(cur != null){
			if(cur.left!=null){
				pre.next = cur.left;
				pre = pre.next;
			}
			if(cur.right!=null){
				pre.next = cur.right;
				pre = pre.next;
			}
			cur = cur.next;
		}
		connect(dummy.next);
	}
}