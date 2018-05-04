package space.fugit;

/*
 * Write an efficient method that takes stockPricesYesterday and returns the 
 * best profit I could have made from one purchase and one sale of one 
 * share of Apple stock yesterday.
 * For example:
 * int[] stockPricesYesterday = new int[] {10, 7, 5, 8, 11, 9};
 * getMaxProfit(stockPricesYesterday)
 * // returns 6 (buying for $5 and selling for $11)
 * 
 * No "shorting"—you need to buy before you can sell. 
 * Also, you can't buy and sell in the same time step—at 
 * least 1 minute has to pass.
 */
public class MaxStockProfit {

	
	public static int getMaxProfit(int[] stockPricesYesterday) {
		int maxProfit = 0;
		for( int i = 0; i < stockPricesYesterday.length - 1; i++) {
			for( int k = i + 1; k < stockPricesYesterday.length; k++) {
				maxProfit = Math.max(maxProfit, stockPricesYesterday[k] - stockPricesYesterday[i]);
			}
		}
		return maxProfit;
	}
	
	public static int getMaxProfitOnce(int[] stockPricesYesterday) {
		int maxProfit = 0;
		int minPrice = stockPricesYesterday[0];
		for( int i = 1; i < stockPricesYesterday.length; i++) {
			int profit = stockPricesYesterday[i] - minPrice;
			if( profit > maxProfit) {
				maxProfit = profit;
			}
			else { //loss
				minPrice = stockPricesYesterday[i];
			}
		}
		return maxProfit;
	}
	
	//account for loss
	public static int getAnyMaxProfit(int[] stockPricesYesterday) {
		if( stockPricesYesterday.length < 2){
			throw new IndexOutOfBoundsException("Required to have at least two prices");
		}
		int maxProfit = stockPricesYesterday[1] - stockPricesYesterday[0];
		int minPrice = 0;
		if( maxProfit > 0) {
			minPrice = stockPricesYesterday[0];
		}
		else {
			minPrice = stockPricesYesterday[1];
		}
		
		for( int i = 2; i < stockPricesYesterday.length; i++) {
			int profit = stockPricesYesterday[i] - minPrice;
			if( profit > maxProfit) {
				maxProfit = profit;
			}
			else { //loss
				minPrice = stockPricesYesterday[i];
			}
		}
		return maxProfit;
	}
}
