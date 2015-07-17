import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber{
	public List<String> letterCombinations(String digits){
		String[] records = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		ArrayList<String> res = new ArrayList<String>();
		if(digits.length()==0) return res;
		letterCombinationsRe(digits, records, res, "");
		return res;
	}
	public void letterCombinationsRe(String digits, String[] records, ArrayList<String> res, String s){
		if(s.length()==digits.length()){
			res.add(s);
			return;
		}
		int index = digits.charAt(s.length())-'0';
		for(int i=0;i<records[index].length();++i){
			letterCombinationsRe(digits, records, res, s+records[index].charAt(i));
		}
	}
}