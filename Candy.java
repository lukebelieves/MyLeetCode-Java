public class Candy{
	public int candy(int[] ratings){
		int res = 0;
		int N = ratings.length;
		if(N == 0) return res;
		int[] candies = new int[N];
		for(int i = 0; i < N; ++i){
			candies[i] = 1;
		}
		for(int i = 1; i < N; ++i){
			if(ratings[i] > ratings[i-1]){
				candies[i] = candies[i-1] + 1;
			}
		}
		for(int i = N-2; i > -1; --i){
			if(ratings[i] > ratings[i+1] && candies[i] <= candies[i+1]){
				candies[i] = candies[i+1] + 1;
			}
		}
		for(int i = 0; i < N; ++i){
			res += candies[i];
		}
		return res;
	}
}