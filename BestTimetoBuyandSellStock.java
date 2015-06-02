public class BestTimetoBuyandSellStock{
	public int maxProfit(int[] prices){
		int n = prices.length;
		if(n <= 1) return 0;
		int res = 0;
		int minValue = prices[0];
		for(int i = 1; i < n; ++i){
			res = Math.max(res, prices[i] - minValue);
			minValue = Math.min(minValue, prices[i]);
		}
		return res;
	}
}