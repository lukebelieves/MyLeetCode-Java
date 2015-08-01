public class PlusOne{
	public int[] plusOne(int[] digits){
		if(digits.length==0) return digits;
		int carry = 1;
		for(int i=digits.length-1;i>=0;--i){
			int temp = (digits[i]+carry)%10;
			carry = (digits[i]+carry)/10;
			digits[i] = temp;
		}
		if(carry==0) return digits;
		int[] res = new int[digits.length+1];
		res[0] = carry;
		for(int i=0;i<digits.length;++i){
			res[i+1] = digits[i];
		}
		return res;
	}
}