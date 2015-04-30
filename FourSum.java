import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum{
	public List<List<Integer>> fourSum(int[] nums, int target){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		int N = nums.length;
		if(N<4) return null;
		Arrays.sort(nums);
		for(int i=0;i<N;++i){
			if(i>0 && nums[i]==nums[i-1])
				continue;
			for(int j=i+1;j<N;++j){
				if(j>i+1 && nums[j]==nums[j-1])
					continue;
				int left = j+1;
				int right = N-1;
				while(left<right){
					if(nums[i]+nums[j]+nums[left]+nums[right]==target){
						ArrayList<Integer> temp = new ArrayList<Integer>();
						temp.add(nums[i]);
						temp.add(nums[j]);
						temp.add(nums[left]);
						temp.add(nums[right]);
						res.add(temp);
						left++;
						right--;
						while(left<right && nums[left]==nums[left-1]) left++;
						while(left<right && nums[right]==nums[right+1]) right--;
					}
					else if(nums[i]+nums[j]+nums[left]+nums[right]<target){
						left++;
					}
					else{
						right--;
					}
				}
			}
		}
		return res;
	}
	
	public static void main(String[] args){
		FourSum foursum = new FourSum();
		int[] nums = {1,2,3,45,6,6};
		int target = 10;
		List<List<Integer>> res = foursum.fourSum(nums, target);
		System.out.print(res);
	}
}