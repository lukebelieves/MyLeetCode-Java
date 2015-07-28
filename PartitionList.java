/*class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val = x;
		next = null;
	}
}*/

public class PartitionList{
	public ListNode partition(ListNode head, int x){
		ListNode leftDummy = new ListNode(-1);
		ListNode rightDummy = new ListNode(-1);
		ListNode leftTail = leftDummy;
		ListNode rightTail = rightDummy;
		for(ListNode t=head; t!=null; t=t.next){
			if(t.val<x){
				leftTail.next = t;
				leftTail = leftTail.next;
			}
			else{
				rightTail.next = t;
				rightTail = rightTail.next;
			}
		}
		leftTail.next = rightDummy.next;
		rightTail.next = null;	//!?
		return leftDummy.next;
	}
}