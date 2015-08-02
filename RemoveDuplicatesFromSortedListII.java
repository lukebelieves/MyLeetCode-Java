public class RemoveDuplicatesFromSortedListII{
	public ListNode deleteDuplicates(ListNode head){
		if(head==null) return head;
		if(head.next==null || head.val!=head.next.val){
			head.next = deleteDuplicates(head.next);
			return head;
		}
		while(head.next!=null && head.val==head.next.val){
			head = head.next;
		}
		return deleteDuplicates(head.next);
	}
}