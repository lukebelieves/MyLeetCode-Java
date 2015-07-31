import java.util.List;
import java.util.ArrayList;

public class PascalTriangle{
	public List<List<Integer>> generate(int numRows){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(numRows==0) return res;
		List<Integer> temp1 = new ArrayList<Integer>();
		temp1.add(1);
		res.add(temp1);
		for(int i=1;i<numRows;++i){
			List<Integer> temp2 = new ArrayList<Integer>();
			temp2.add(1);
			for(int j=1;j<i;++j){
				temp2.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
			}
			temp2.add(1);
			res.add(temp2);
		}
		return res;
	}
}