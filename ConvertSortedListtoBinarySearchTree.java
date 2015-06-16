/*class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val = x;
		next = null;
	}
}*/

public class ConvertSortedListtoBinarySearchTree{
	public TreeNode sortedListToBST(ListNode head){
		return sortedListToBSTRe(head, null);
	}
	public TreeNode sortedListToBSTRe(ListNode start, ListNode end){
		if(start == end) return null;
		ListNode fast = start;
		ListNode slow = start;
		while(fast != end && fast.next != end){
			fast = fast.next.next;
			slow = slow.next;
		}
		TreeNode root = new TreeNode(slow.val);
		root.left = sortedListToBSTRe(start, slow);
		root.right = sortedListToBSTRe(slow.next, end);
		return root;
	}
}