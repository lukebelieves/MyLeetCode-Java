public class BestTimetoBuyandSellStockIII{
	public int maxProfit(int[] prices){
		int n = prices.length;
		if(n <= 1) return 0;
		int[] l2r = new int[n];
		int[] r2l = new int[n];
		l2r[0] = 0;
		r2l[n-1] = 0;
		int minValue = prices[0];
		for(int i = 1; i < n; ++i){
			l2r[i] = Math.max(l2r[i-1], prices[i]-minValue);
			minValue = Math.min(minValue, prices[i]);
		}
		int maxValue = prices[n-1];
		for(int i = n-2; i >= 0; --i){
			r2l[i] = Math.max(r2l[i+1], maxValue-prices[i]);
			maxValue = Math.max(maxValue, prices[i]);
		}
		int res = l2r[n-1];
		for(int i = 0; i < n-1; ++i){
			res = Math.max(res, l2r[i]+r2l[i+1]);
		}
		return res;
	}
}