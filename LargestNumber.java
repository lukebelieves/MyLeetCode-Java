import java.util.Comparator;
import java.util.Arrays;

public class LargestNumber{
    public String largestNumber(int[] nums) {
    	int N = nums.length;
    	if(N==0) return null;
    	Comparator<Integer> comp = new Comparator<Integer>(){
    		public int compare(Integer a, Integer b){
    			String ab = "" + a + b;
    			String ba = "" + b + a;
    			return -ab.compareTo(ba);
    		}
    	};
    	Integer[] in = new Integer[N];
    	for(int i = 0; i<N; ++i){
    		in[i] = Integer.valueOf(nums[i]);
    	}
    	Arrays.sort(in, comp);
    	StringBuilder res = new StringBuilder();
    	if(in[0]==0) return new String("0");
    	for(int i = 0; i<N; ++i){
    		res.append(String.valueOf(in[i]));
    	}
    	return res.toString();
    }

}