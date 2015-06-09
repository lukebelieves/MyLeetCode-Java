import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

class UndirectedGraphNode{
	int label;
	List<UndirectedGraphNode> neighbors;
	UndirectedGraphNode(int x){
		label = x;
		neighbors = new ArrayList<UndirectedGraphNode>();
	}
}

public class CloneGraph{
	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node){
		HashMap<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
		return cloneGraphRe(node, map);
	}
	public UndirectedGraphNode cloneGraphRe(UndirectedGraphNode node, HashMap<UndirectedGraphNode, UndirectedGraphNode> map){
		if(node == null) return null;
		if(map.containsKey(node)) return map.get(node);
		UndirectedGraphNode newnode = new UndirectedGraphNode(node.label);
		map.put(node, newnode);
		for(UndirectedGraphNode cur : node.neighbors){
			newnode.neighbors.add(cloneGraphRe(cur, map));
		}
		return newnode;
	}
}