/*class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		val = x;
		next = null;
	}
}*/
import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists{
	public ListNode mergeKLists(ListNode[] lists){
		Comparator<ListNode> comp = new Comparator<ListNode>(){
			public int compare(ListNode a, ListNode b){
				return a.val - b.val;
			}
		};
		PriorityQueue<ListNode> q = new PriorityQueue<ListNode>(10, comp);
		for(int i=0;i<lists.length;++i){
			if(lists[i]!=null) q.add(lists[i]);
		}
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		while(!q.isEmpty()){
			ListNode t = q.poll();
			if(t.next!=null) q.add(t.next);
			tail.next = t;
			tail = tail.next;
		}
		return dummy.next;
	}
}