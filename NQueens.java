import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class NQueens{
	public List<List<String>> solveNQueens(int n){
		List<List<String>> res = new ArrayList<List<String>>();
		int[] chess = new int[n];	//queen column index for each row
		Arrays.fill(chess, -1);
		solveNQueensRe(res, chess, 0, n);	//0th row
		return res;
	}
	public void solveNQueensRe(List<List<String>> res, int[] chess, int row, int n){
		if(row==n){
			ArrayList<String> solution = new ArrayList<String>();
			for(int i=0;i<n;++i){
				String rowResult = new String();
				for(int j=0;j<n;++j){
					if(j!=chess[i]) rowResult += ".";
					else rowResult += 'Q';
				}
				solution.add(rowResult);
			}
			res.add(solution);
			return;
		}
		for(int column=0; column < n; ++column){
			if(isValid(chess, row, column, n)){
				chess[row] = column;
				solveNQueensRe(res, chess, row+1, n);
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