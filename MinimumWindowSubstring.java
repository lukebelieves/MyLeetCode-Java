import java.util.Arrays;

public class MinimumWindowSubstring{
	public String minWindow(String s, String t){
		int Ns = s.length();
		int Nt = t.length();
		if(Ns < Nt) return new String("");
		int[] need = new int[256];
		int[] find = new int[256];
		Arrays.fill(need, 0);
		Arrays.fill(find, 0);
		for(int i=0;i<Nt;++i){
			need[t.charAt(i)]++;
		}
		int resLeft = -1;
		int resRight = Ns;
		int count = 0;
		for(int left=0, right=0; right<Ns; ++right){
			if(need[s.charAt(right)]==0) continue;
			if(need[s.charAt(right)] > find[s.charAt(right)]) count++;
			find[s.charAt(right)]++;
			if(count < Nt) continue;
			for(; left<right; ++left){
				if(need[s.charAt(left)]==0) continue;
				if(need[s.charAt(left)]==find[s.charAt(left)]) break;
				find[s.charAt(left)]--;
			}
			if(right-left < resRight-resLeft){
				resLeft = left;
				resRight = right;
			}
		}
		if(resLeft==-1) return new String("");
		return s.substring(resLeft, resRight+1);
	}
}