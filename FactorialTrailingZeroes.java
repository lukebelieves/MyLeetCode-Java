public class FactorialTrailingZeroes{
	public int trailingZeroes(int n){
		int res = 0;
		while(n > 0){
			int temp = n / 5;
			res += temp;
			n = temp;
		}
		return res;
	}
}