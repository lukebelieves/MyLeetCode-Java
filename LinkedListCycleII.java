public class LinkedListCycleII{
	public ListNode detectCycle(ListNode head){
		if(head==null || head.next==null) return null;
		ListNode fast = head;
		ListNode slow = head;
		boolean cycleFlag = false;
		while(fast!=null && fast.next!=null){
			fast = fast.next.next;
			slow = slow.next;
			if(fast==slow){
				cycleFlag = true;
				break;
			}
		}
		if(cycleFlag==false) return null;
		slow = head;
		while(slow!=fast){
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
}