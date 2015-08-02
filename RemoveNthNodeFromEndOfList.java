public class RemoveNthNodeFromEndOfList{
	public ListNode removeNthFromEnd(ListNode head, int n){
		ListNode dummy = new ListNode(-1);
		ListNode fast = dummy, slow = dummy;
		dummy.next = head;
		for(int i=1;i<=n+1;++i){
			fast = fast.next;
		}
		while(fast!=null){
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return dummy.next;
	}
}