package space.fugit;

public class Main {

	public static void main(String[] args) {
		System.out.println(CollapseAdjacentDuplicateCharClass.getString("abbac"));
		System.out.println(""+MaxStockProfit.getAnyMaxProfit(new int[] {10, 8, 6, 4, 2, 2, -1}));
		System.out.println(""+MaxStockProfit.getAnyMaxProfit(new int[] {10}));
	}
}
