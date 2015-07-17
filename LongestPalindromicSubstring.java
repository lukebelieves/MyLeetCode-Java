public class LongestPalindromicSubstring{
	public String longestPalindrome(String s){
		int N = s.length();
		if(N==0) return new String();
		if(N==1) return s;
		int maxLength = 1;
		int start = 0;
		for(int i=1;i<N;++i){
			//even case
			int left = i-1;
			int right = i;
			while(left>=0 && right<N && s.charAt(left)==s.charAt(right)){
				if(right-left+1>maxLength){
					maxLength = right-left+1;
					start = left;
				}
				left--;
				right++;
			}
			//odd case
			left = i-1;
			right = i+1;
			while(left>=0 && right<N && s.charAt(left)==s.charAt(right)){
				if(right-left+1>maxLength){
					maxLength = right-left+1;
					start = left;
				}
				left--;
				right++;
			}
		}
		return s.substring(start, start+maxLength);
	}
}