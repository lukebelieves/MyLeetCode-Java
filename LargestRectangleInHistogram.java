public class LargestRectangleInHistogram{
	public int largestRectangleArea(int[] height){
		int N = height.length;
		if(N==1) return height[0];
		return largestRectangleAreaRe(height, 0, N-1);
	}
	public int largestRectangleAreaRe(int[] height, int start, int end){
		if(start==end) return height[start];
		if(start>end) return 0;
		int mid = (start+end)/2;
		int area = Math.max(largestRectangleAreaRe(height, start, mid), largestRectangleAreaRe(height, mid+1, end));
		area = Math.max(area, expandMid(height, start, end));
		return area;
	}
	public int expandMid(int[] height, int start, int end){
		int mid = (start+end)/2;
		int i = mid;
		int j = mid+1;
		int area = 0;
		int h = Integer.MAX_VALUE;
		while(i>=start && j<=end){
			h = Math.min(h, Math.min(height[i], height[j]));
			area = Math.max(area, (j-i+1)*h);
			if(i==start){
				j++;
			}
			else if(j==end){
				i--;
			}
			else{
				if(height[i-1]<=height[j+1]){
					j++;
				}
				else{
					i--;
				}
			}
		}
		return area;
	}
}