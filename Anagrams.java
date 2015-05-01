import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;

public class Anagrams{
	public List<String> anagrams(String[] strs){
		ArrayList<String> res = new ArrayList<String>();
		HashMap<String, ArrayList<String>> group = new HashMap<String, ArrayList<String>>();
		if(strs.length==0) return res;
		for(int i=0;i<strs.length;++i){
			char[] tmp = strs[i].toCharArray();
			Arrays.sort(tmp);
			String s = String.valueOf(tmp);
			if(group.containsKey(s)){
				(group.get(s)).add(strs[i]);
			}
			else{
				ArrayList<String> t = new ArrayList<String>();
				t.add(strs[i]);
				group.put(s, t);
			}
		}
		Iterator<Entry<String, ArrayList<String>>> iter = group.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry entry = (Map.Entry) iter.next();
			ArrayList<String> val = (ArrayList<String>) entry.getValue();
			if(val.size()>1){
				res.addAll(val);
			}
		}
		
		
		return res;
	}
}