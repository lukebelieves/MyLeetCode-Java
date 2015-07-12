import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses{
	public List<String> generateParenthesis(int n){
		ArrayList<String> res = new ArrayList<String>();
		generateParenthesisRe(res, n, n, "");
		return res;
	}
	public void generateParenthesisRe(ArrayList<String> res, int left, int right, String s){
		if(left==0 && right==0){
			res.add(s);
		}
		if(left>0){
			generateParenthesisRe(res, left-1, right, s+"(");
		}
		if(right>left){
			generateParenthesisRe(res, left, right-1, s+")");
		}
	}
}