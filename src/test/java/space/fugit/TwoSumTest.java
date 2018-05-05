package space.fugit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

	@Test
	void testGetTwoSum() {
		assertArrayEquals(new int[] {0, 2}, TwoSum.getTwoSum(new int[] {2, 11, 7, 15}, 9));
		assertArrayEquals(new int[] {1, 2}, TwoSum.getTwoSum(new int[] {3, 2, 4}, 6));
	}
	
	
	@Test
	void testGetTwoSumMap() {
		assertArrayEquals(new int[] {1,2}, TwoSum.getTwoSumMap(new int[] {11,2,7,15}, 9));
		assertArrayEquals(new int[] {0,2}, TwoSum.getTwoSumMap(new int[] {3,2,3}, 6));
		assertArrayEquals(new int[] {2,4}, TwoSum.getTwoSumMap(new int[] {-1,-2,-3,-4,-5}, -8));
		assertArrayEquals(new int[] {0,3}, TwoSum.getTwoSumMap(new int[] {150,24,79,50,88,345,3}, 200));
		assertArrayEquals(new int[] {0,1}, TwoSum.getTwoSumMap(new int[] {-1, 0}, -1));
	}
	
	@Test 
	void testGetTwoSumSortedShould1BasedIndex(){
		assertArrayEquals(new int[] {1,2}, TwoSum.getTwoSumSorted(new int[] {-1, 0}, -1));
		assertArrayEquals(new int[] {1,4}, TwoSum.getTwoSumSorted(new int[] {-3, 0, 2, 3, 4, 5,}, 0));
	}
}
