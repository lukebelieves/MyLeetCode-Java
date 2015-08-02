/*class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val = x;
	}
}*/

public class RemoveDuplicatesFromSortedList{
	public ListNode deleteDuplicates(ListNode head){
		if(head==null) return head;
		int last = head.val;
		ListNode tail = head;
		ListNode cur = head.next;
		while(cur!=null){
			if(cur.val==last){
				cur = cur.next;
				tail.next = cur;
			}
			else{
				tail.next = cur;
				last = cur.val;
				tail = tail.next;
				cur = cur.next;
			}
		}
		return head;
	}
}