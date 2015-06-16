import java.util.HashMap;

class RandomListNode{
	int label;
	RandomListNode next;
	RandomListNode random;
	RandomListNode(int x){
		label = x;
		next = null;
		random = null;
	}
}

public class CopyListwithRandomPointer{
	public RandomListNode copyRandomList(RandomListNode head){
		HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
		RandomListNode dummy = new RandomListNode(-1);
		RandomListNode cur = head;
		RandomListNode curNew = dummy;
		while(cur != null){
			if(map.containsKey(cur) == false){
				map.put(cur, new RandomListNode(cur.label));
			}
			if(cur.random != null && map.containsKey(cur.random) == false){
				map.put(cur.random, new RandomListNode(cur.random.label));
			}
			curNew.next = map.get(cur);
			curNew.next.random = map.get(cur.random);
			curNew = curNew.next;
			cur = cur.next;
		}
		return dummy.next;
	}
}