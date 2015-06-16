public class CountandSay{
	public String countAndSay(int n){
		StringBuilder cur = new StringBuilder("1");
		StringBuilder pre;
		char say;
		for(int i = 2; i <= n; ++i){
			pre = cur;
			cur = new StringBuilder();
			say = pre.charAt(0);
			int count = 1;
			int pre_len = pre.length();
			for(int j = 1; j < pre_len; ++j){
				if(pre.charAt(j) != say){
					cur.append(count);
					cur.append(say);
					say = pre.charAt(j);
					count = 1;
				}
				else{
					++count;
				}
			}
			cur.append(count);
			cur.append(say);
		}
		return cur.toString();
	}
}