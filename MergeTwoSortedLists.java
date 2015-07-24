/*class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val = x;
		next = null;
	}
}*/

public class MergeTwoSortedLists{
	public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		ListNode dump = new ListNode(0);
		ListNode tail = dump;
		while(l1!=null && l2!=null){
			if(l1.val<l2.val){
				ListNode t1 = l1;
				l1 = l1.next;
				tail.next = t1;
				tail = tail.next; 
			}
			else{
				ListNode t2 = l2;
				l2 = l2.next;
				tail.next = t2;
				tail = tail.next;
			}
		}
		if(l1!=null){
			tail.next = l1;
		}
		if(l2!=null){
			tail.next = l2;
		}
		return dump.next;
	}
}