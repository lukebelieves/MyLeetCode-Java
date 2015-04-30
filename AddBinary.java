public class AddBinary{
	public String addBinary(String a, String b){
		StringBuffer res = new StringBuffer();
		int ia = a.length()-1;
		int ib = b.length()-1;
		int carry = 0;
		while(ia>=0 || ib>=0){
			int sum = carry;
			if(ia>=0){
				sum += a.charAt(ia--)-'0';
			}
			if(ib>=0){
				sum += b.charAt(ib--)-'0';
			}
			carry = sum/2;
			res.insert(0, String.valueOf(sum%2));
		}
		if(carry==1){
			res.insert(0, "1");
		}
		
		return res.toString();
	}
}