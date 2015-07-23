//https://leetcode.com/discuss/17815/share-one-divide-conquer-log-method-with-clear-description

public class MedianOfTwoSortedArrays{
	public double findMedianSortedArrays(int[] nums1, int[] nums2){
		int N1 = nums1.length, N2 = nums2.length;
		if((N1+N2)%2==0){
			return (findKth(nums1, 0, N1-1, nums2, 0, N2-1, (N1+N2)/2) + findKth(nums1, 0, N1-1, nums2, 0, N2-1, (N1+N2)/2+1))*0.5;
		}
		else{
			return findKth(nums1, 0, N1-1, nums2, 0, N2-1, (N1+N2)/2+1);
		}
	}
	public double findKth(int[] nums1, int left1, int right1, int[] nums2, int left2, int right2, int k){
		if(left1 > right1) return nums2[left2+k-1];
		if(left2 > right2) return nums1[left1+k-1];
		int mid1 = (left1+right1)/2, mid2 = (left2+right2)/2;
		if(nums1[mid1] <= nums2[mid2]){
			if(k <= (mid1-left1)+(mid2-left2)+1){
				return findKth(nums1, left1, right1, nums2, left2, mid2-1, k);
			}
			else{
				return findKth(nums1, mid1+1, right1, nums2, left2, right2, k-(mid1-left1)-1);
			}
		}
		else{
			if(k <= (mid1-left1)+(mid2-left2)+1){
				return findKth(nums1, left1, mid1-1, nums2, left2, right2, k);
			}
			else{
				return findKth(nums1, left1, right1, nums2, mid2+1, right2, k-(mid2-left2)-1);
			}
		}
	}
}