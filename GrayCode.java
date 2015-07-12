import java.util.ArrayList;
import java.util.List;

public class GrayCode{
	public List<Integer> grayCode(int n){
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(int i=0;i<1<<n;++i){
			res.add(i^(i/2));
		}
		return res;
	}
}