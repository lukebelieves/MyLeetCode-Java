/*class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val = x;
		next = null;
	}
}*/

public class InsertionSortList{
	public ListNode insertionSortList(ListNode head){
		if(head == null || head.next == null) return head;
		ListNode dummy = new ListNode(Integer.MIN_VALUE);
		dummy.next = head;
		ListNode cur = head.next;
		head.next = null;
		while(cur != null){
			ListNode temp = dummy;
			while(temp.next!=null && temp.next.val < cur.val) temp = temp.next;
			ListNode next = cur.next;
			cur.next = temp.next;
			temp.next = cur;
			cur = next;
		}
		return dummy.next;
	}
}