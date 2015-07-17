public class LongestCommonPrefix{
	public String longestCommonPrefix(String[] strs){
		String res = "";
		if(strs==null || strs.length==0) return res;
		int minLength = Integer.MAX_VALUE;
		for(int i=0;i<strs.length;++i){
			if(strs[i].length()<minLength) minLength = strs[i].length();
		}
		for(int i=0;i<minLength;++i){
			char ch = strs[0].charAt(i);
			boolean flag = true;
			for(int j=0;j<strs.length;++j){
				if(strs[j].charAt(i)!=ch){
					flag = false;
					break;
				}
			}
			if(flag==true){
				res = res+ch;
			}
			else{
				break;
			}
		}
		return res;
	}
}