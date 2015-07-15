public class LengthOfLastWord{
	public int lengthOfLastWord(String s){
		int N = s.length();
		boolean lastWordFlag = false;
		int res = 0;
		for(int i = N-1; i >= 0; --i){
			if(lastWordFlag==false){
				if(s.charAt(i)!=' '){
					lastWordFlag = true;
					res++;
				}
			}
			else{
				if(s.charAt(i)==' '){
					return res;
				}
				else{
					res++;
				}
			}
		}
		return res;
	}
}