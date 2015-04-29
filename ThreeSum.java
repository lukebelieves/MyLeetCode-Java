import java.util.*;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] num) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();	//?
		Arrays.sort(num);
		int N = num.length;
		for(int i = 0; i <= N-3 && num[i] <= 0; ++i) {
			if(i > 0 && num[i] == num[i-1])
				continue;
			int a = num[i];
			int start = i + 1;
			int end = N-1;
			while(start < end) {
				int b = num[start];
				int c = num[end];
				if(a + b + c == 0) {
					ArrayList<Integer> temp = new ArrayList<Integer>();	//Is there other initial method?
					temp.add(a);
					temp.add(b);
					temp.add(c);
					res.add(temp);
					++start;
					--end;
					while(start < end && num[start] == num[start-1])
						++start;
					while(start < end && num[end] == num[end+1])
						--end;
				}
				else if(a + b + c < 0) {
					++start;
				}
				else {
					--end;
				}
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		ThreeSum ins = new ThreeSum();
		int[] num = {-9,14,-7,-8,9,1,-10,-8,13,12,6,9,3,-3,-15,-15,1,8,-7,-4,-6,8,2,-10,8,11,-15,3,0,-11,-1,-1,10,0,6,5,-14,3,12,-15,-7,-5,9,11,-1,1,3,-15,-5,11,-12,-4,-4,-2,-6,-10,-6,-6,0,2,-9,14,-14,-14,-9,-1,-2,-7,-12,-13,-15,-4,-3,1,14,3,-12,3,3,-10,-9,-1,-7,3,12,-6,0,13,4,-15,0,2,6,1,3,13,8,-13,13,11,11,13,14,-6};
		List<List<Integer>> res = ins.threeSum(num);
		System.out.print(res);
	}
}