import java.util.ArrayList;

public class PermutationSequence{
	public String getPermutation(int n, int k){
		StringBuilder res = new StringBuilder();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i=1;i<=n;++i) numbers.add(i);
		int[] factorial = new int[n+1];
		factorial[0] = 1;
		for(int i=1;i<=n;++i){
			factorial[i] = factorial[i-1]*i;
		}
		k = k - 1;
		for(int i=1;i<=n;++i){
			int index = k/factorial[n-i];
			res.append(numbers.get(index));
			numbers.remove(index);
			k = k - index*factorial[n-i];
		}
		return res.toString();
	}
}