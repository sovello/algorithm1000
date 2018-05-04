package space.fugit;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HighestProductOfThreeTest {

	private static int[] expected = new int[] {60, 120, 210, 60, 210, 1000, 5000};
	private static List<int[]> input = new ArrayList<int[]>();
	
	
	@Test
	void testGetHighestProductOfThreeIntegers() {
		input.add(new int[] {1, 2, 3, 4, 5});
		input.add(new int[] {2, 3, 4, 5, 6});
		input.add(new int[] {3, 4, 5, 6, 7});
		input.add(new int[] {3, 4, 5});
		input.add(new int[] {5, 6, 7});
		input.add(new int[] {5, 10, 10, 0, 10});
		input.add(new int[]{1, 10, -5, 1, -100});
		for( int i = 0; i < expected.length; i++){
			assertEquals(expected[i], HighestProductOfThree.getHighestProductOf3(input.get(i)));
		}
		
	}
	
	@Test
	void testGetHighestProductOf3Refactored() {
		input.add(new int[] {1, 2, 3, 4, 5});
		input.add(new int[] {2, 3, 4, 5, 6});
		input.add(new int[] {3, 4, 5, 6, 7});
		input.add(new int[] {3, 4, 5});
		input.add(new int[] {5, 6, 7});
		input.add(new int[] {5, 10, 10, 0, 10});
		input.add(new int[]{1, 10, -5, 1, -100});
		for( int i = 0; i < expected.length; i++){
			assertEquals(expected[i], HighestProductOfThree.getHighestProductOf3Refactored(input.get(i)));
		}
	}
}
