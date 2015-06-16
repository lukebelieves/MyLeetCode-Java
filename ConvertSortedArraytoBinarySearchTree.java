public class ConvertSortedArraytoBinarySearchTree{
	public TreeNode sortedArrayToBST(int[] nums){
		return sortedArrayToBSTRe(nums, 0, nums.length-1);
	}
	public TreeNode sortedArrayToBSTRe(int[] nums, int left, int right){
		if(left > right) return null;
		if(left == right) return new TreeNode(nums[left]);
		int mid = (left+right)/2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = sortedArrayToBSTRe(nums, left, mid-1);
		root.right = sortedArrayToBSTRe(nums, mid+1, right);
		return root;
	}
}