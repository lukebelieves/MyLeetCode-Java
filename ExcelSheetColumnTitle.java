public class ExcelSheetColumnTitle{
	public String convertToTitle(int n){
		StringBuilder res = new StringBuilder();
		while(n > 0){
			res.insert(0, (char)((n - 1) % 26 + 'A'));
			n = (n - 1) / 26;
		}
		return res.toString();
	}
}