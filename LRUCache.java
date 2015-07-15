import java.util.LinkedHashMap;

public class LRUCache{
	private LinkedHashMap<Integer, Integer> map;
	private int capacity;
	
	public LRUCache(int capacity){
		this.capacity = capacity;
		map = new LinkedHashMap<Integer, Integer>();
	}
	
	public int get(int key){
		Integer value = map.get(key);
		if(value==null) return -1;
		map.remove(key);
		map.put(key, value);
		return value;
	}
	
	public void set(int key, int value){
		map.remove(key);
		map.put(key, value);
		if(map.size() > capacity){
			map.remove(map.entrySet().iterator().next().getKey());
		}
	}
}