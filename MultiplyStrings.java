import java.util.Arrays;

public class MultiplyStrings{
	public String multiply(String num1, String num2){
		int l1 = num1.length();
		int l2 = num2.length();
		if(l1==0 || l2==0) return new String();
		if(num1.charAt(0)=='0' || num2.charAt(0)=='0') return new String("0");
		StringBuilder sb = new StringBuilder();
		int[] res = new int[l1+l2];
		Arrays.fill(res, 0);
		for(int i=0;i<l1;++i){
			for(int j=0;j<l2;++j){
				res[i+j+1] += (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
			}
		}
		int c = 0;
		for(int i=res.length-1;i>=1;--i){
			res[i] += c;
			c = res[i]/10;
			res[i] = res[i]%10;
			sb.insert(0, res[i]);
		}
		if(c!=0){
			sb.insert(0, c);
		}
		return sb.toString();
	}
}