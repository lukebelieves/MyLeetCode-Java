import java.util.List;
import java.util.ArrayList;

public class PascalTriangleII{
	public List<Integer> getRow(int rowIndex){
		List<Integer> res = new ArrayList<Integer>();
		res.add(1);
		if(rowIndex==0) return res;
		for(int i=1;i<=rowIndex;++i){
			List<Integer> temp = new ArrayList<Integer>();
			temp.add(1);
			for(int j=1;j<i;++j){
				temp.add(res.get(j-1)+res.get(j));
			}
			temp.add(1);
			res = temp;
		}
		return res;
	}
}