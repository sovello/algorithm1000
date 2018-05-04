package space.fugit;

public class ProductsInArray {

	public static int[] getProductsOfAllIntsExceptAtIndex(int[] ints) {
		int[] products = new int[ints.length];
		for( int i = 0; i < ints.length; i++) {
			int product = 1;
			for( int j = 0; j < ints.length; j++) {
				if( j != i) {
					product = product * ints[j];
				}
			}
			products[i] = product;
		}
		return products;
	}
	
	public static int[] getProductsOfAllIntsExceptAtIndexByDivision(int[] ints, int product) {
		for(int i = 0; i < ints.length; i++) {
			if( ints[i] != 0) {
				ints[i] = product/ints[i];
			}
		}
		return ints;
	}
	
	public static int getProduct(int[] integers) {
		int product = 1;
		for( int i = 0; i < integers.length; i++) {
			if( integers[i] != 0) {
				product *= integers[i];
			}
		}
		return product;
	}
	
	public static int[] getProductsOfAllIntsExceptAtIndexOnce(int[] ints) {
		int[] productsBeforeIndex = new int[ints.length];
		int currentProduct = 1;
		
		/**
		 * get all products before an index, for index 0, the product before is 1
		 */
		for( int i = 0; i < ints.length; i++) {
			productsBeforeIndex[i] = currentProduct;
			currentProduct *= ints[i];
		}
		
		currentProduct = 1;
		
		/**
		 * get all products after a given index, for index length-1, product before is 1
		 */
		for( int i = ints.length-1; i >= 0; i--) {
			productsBeforeIndex[i] = productsBeforeIndex[i] * currentProduct;
			currentProduct *= ints[i];
		}
		
		return productsBeforeIndex;
	}
}
