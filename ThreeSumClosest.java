import java.util.Arrays;


public class ThreeSumClosest {
	public int threeSumClosest (int[] num, int target) {
		int res = num[0] + num[1] + num[2];
		int N = num.length;
		Arrays.sort(num);
		for(int i = 0; i < N - 2; ++i) {
			int a = num[i];
			int start = i + 1;
			int end = N - 1;
			while(start < end) {
				int b = num[start];
				int c = num[end];
				if(a + b + c == target) {
					return target;
				}
				else if(a + b + c < target) {
					++start;
				}
				else {
					--end;
				}
				if(Math.abs(a + b + c - target) < Math.abs(res - target)) {
					res = a + b + c;
				}
			}
		}
		
		return res;
	}
}