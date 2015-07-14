/*class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val = x;
		next = null;
	}
}*/

public class IntersectionOfTwoLinkedList{
	public ListNode getIntersectionNode(ListNode headA, ListNode headB){
		if(headA==null || headB==null) return null;
		int lengthA = 1;
		int lengthB = 1;
		ListNode tempA = headA;
		ListNode tempB = headB;
		while(tempA.next != null){
			tempA = tempA.next;
			++lengthA;
		}
		while(tempB.next != null){
			tempB = tempB.next;
			++lengthB;
		}
		tempA = headA;
		tempB = headB;
		if(lengthA >= lengthB){
			int d = lengthA-lengthB;
			while(d>0){
				tempA = tempA.next;
				d--;
			}
		}
		else{
			int d = lengthB-lengthA;
			while(d>0){
				tempB = tempB.next;
				d--;
			}
		}
		while(tempA!=null && tempB!=null){
			if(tempA==tempB){
				return tempA;
			}
			tempA = tempA.next;
			tempB = tempB.next;
		}
		return null;
	}
}