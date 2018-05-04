package space.fugit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

/*
 * Get the product of elements in an array except at the index
 * 
 * e.g. given [1, 7, 4, 3]
 * return [84, 12, 21, 28] i.e [7*4*3, 1*4*3, 1*7*3, 1*7*4]
 * 
 */

public class ProductsInArrayTest {

	@Test
	void testGetProductsOfAllIntsExceptAtIndex() {
		int[] expected = new int[] {84, 12, 21, 28};
		int[] input = new int[] {1, 7, 4, 3};
		assertArrayEquals(expected, ProductsInArray.getProductsOfAllIntsExceptAtIndex(input));
	}
	
	@Test
	void testGetProductsOfAllIntsExceptAtIndexByDivision() {
		int[] expected = new int[] {84, 12, 21, 28};
		int[] input = new int[] {1, 7, 4, 3};
		assertArrayEquals(expected, ProductsInArray.getProductsOfAllIntsExceptAtIndexByDivision(input, 84));
	}
	
	@Test
	void testGetProductsOfAllIntsExceptAtIndexOnce() {
		List<int[]> expected = new ArrayList<int[]>();
		expected.add(new int[] {84, 12, 21, 28});
		expected.add(new int[] {0, 0, 28, 0});
		expected.add(new int[] {0, 0, 0, 0, 0});
		expected.add(new int[] {7, 1});
		expected.add(new int[] {1});
		
		List<int[]> input = new ArrayList<int[]>();
		input.add(new int[] {1, 7, 4, 3});
		input.add(new int[] {1, 7, 0, 4});
		input.add(new int[] {1, 7, 0, 4, 0});
		input.add(new int[] {1, 7});
		input.add(new int[] {1});
		for( int i = 0; i < expected.size(); i++ ) {
			assertArrayEquals(expected.get(i), ProductsInArray.getProductsOfAllIntsExceptAtIndexOnce(input.get(i)));
		}
	}
	
	@Test
	void testGetProduct() {
		assertEquals(28, ProductsInArray.getProduct(new int[] {1, 7, 0, 4}));
		assertEquals(28, ProductsInArray.getProduct(new int[] {1, 7, 0, 4, 0}));
	}

}
