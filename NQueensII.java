import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueensII{
	int res;
	public int totalNQueens(int n){
		res = 0;
		int[] chess = new int[n];	//queen column index for each row
		Arrays.fill(chess, -1);
		solveNQueensRe(chess, 0, n);	//0th row
		return res;
	}
	public void solveNQueensRe(int[] chess, int row, int n){
		if(row==n){
			res++;
			return;
		}
		for(int column=0; column < n; ++column){
			if(isValid(chess, row, column, n)){
				chess[row] = column;
				solveNQueensRe(chess, row+1, n);
				chess[row] = -1;
			}
		}
	}
	public boolean isValid(int[] chess, int row, int column, int n){
		for(int i=0;i<n;++i){
			if(chess[i] == -1) continue;
			if(chess[i] == column || Math.abs(row-i) == Math.abs(column-chess[i])) return false;
		}
		return true;
	}
}