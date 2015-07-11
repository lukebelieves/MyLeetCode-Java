import java.util.HashMap;

public class FractionToRecurringDecimal{
	public String fractionToDecimal(int numerator, int denominator){
		if(numerator==0) return new String("0");
		boolean flag = (numerator < 0) ^ (denominator < 0);
		long Numerator = Math.abs((long)numerator);
		long Denominator = Math.abs((long)denominator);
		StringBuilder res = new StringBuilder();
		if(flag) res.append("-");
		res.append(String.valueOf(Numerator/Denominator));
		Numerator = Numerator % Denominator;
		if(Numerator == 0) return res.toString();
		
		res.append(".");
		HashMap<Long, Integer> map = new HashMap<Long, Integer>();
		for(int i = res.length();Numerator != 0;++i){
			if(map.containsKey(Numerator)) break;
			map.put(Numerator, i);
			Numerator = Numerator * 10;
			res.append(String.valueOf(Numerator/Denominator));
			Numerator = Numerator % Denominator;
		}
		if(Numerator==0) return res.toString();
		res.insert(map.get(Numerator), "(");
		res.append(")");
		return res.toString();
	}
}

