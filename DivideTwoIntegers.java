public class DivideTwoIntegers{
	public int divide(int dividend, int divisor){
		boolean flag = dividend < 0 ^ divisor < 0;
		long Dividend = Math.abs((long)dividend);
		long Divisor = Math.abs((long)divisor);
		long res = 0;
		while(Divisor <= Dividend){
			for(int i = 0; (Divisor << i) <= Dividend; ++i){
				Dividend -= (Divisor << i);
				res += (1 << i);
			}
		}
		if(flag) res = -res;
		if(res > Integer.MAX_VALUE) res = Integer.MAX_VALUE;
		return (int)res;
	}
}