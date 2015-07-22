import java.util.Arrays;

public class MaximalRectangle{
	public int maximalRectangle(char[][] matrix){
		if(matrix==null) return 0;
		if(matrix.length==0 || matrix[0].length==0) return 0;
		int M = matrix.length;
		int N = matrix[0].length;
		int res = 0;
		int[] height = new int[N];
		int[] left = new int[N];
		int[] right = new int[N];
		Arrays.fill(height, 0);
		Arrays.fill(left, 0);
		Arrays.fill(right, N);
		for(int i=0;i<M;++i){
			int cur_left = 0;
			int cur_right = N;
			for(int j=0;j<N;++j){
				if(matrix[i][j]=='1') height[j]++;
				else height[j] = 0;
			}
			for(int j=0;j<N;++j){
				if(matrix[i][j]=='1') left[j] = Math.max(cur_left, left[j]);
				else{
					left[j] = 0;
					cur_left = j+1;
				}
			}
			for(int j=N-1;j>=0;--j){
				if(matrix[i][j]=='1') right[j] = Math.min(cur_right, right[j]);
				else{
					right[j] = N;
					cur_right = j;
				}
			}
			for(int j=0;j<N;++j){
				res = Math.max(res, (right[j]-left[j])*height[j]);
			}
		}
		return res;
	}
}