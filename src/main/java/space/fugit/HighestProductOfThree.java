package space.fugit;

public class HighestProductOfThree {
	
	public static int getHighestProductOf3(int[] intArray) {
		int maxProductOf2 = intArray[1] * intArray[0];
		int minProductOf2 = intArray[1] * intArray[0];
		
		int maxProductOf3 = intArray[1] * intArray[0] * intArray[2];
		int max = Math.max(intArray[0], intArray[1]);
		int min = Math.min(intArray[0], intArray[1]);
		
		for( int i = 2; i < intArray.length; i++) {
			int current = intArray[i];
			if( current * maxProductOf2 > maxProductOf3) {
				maxProductOf3 = current * maxProductOf2;
			}
			
			if( current * minProductOf2 > maxProductOf3) {
				maxProductOf3 = current * minProductOf2;
			}
			
			if( current * max > maxProductOf2) {
				maxProductOf2 = current * max;
			}
			if( current * min > maxProductOf2) {
				maxProductOf2 = current * min;
			}
			
			if( current * max < minProductOf2) {
				minProductOf2 = current * max;
			}
			if( current * min < minProductOf2) {
				minProductOf2 = current * min;
			}
			
			if( current > max ) {
				max = current;
			}
			if( current < min) {
				min = current;
			}
		}
		
		return maxProductOf3;
	}
	
	/**
	 * Refactor
	 */
	public static int getHighestProductOf3Refactored(int[] intArray) {
		if( intArray.length < 3) {
			throw new IllegalArgumentException("Requires an array with at least 3 elements");
		}
		
		int maxProductOf3 = intArray[0] * intArray[1] * intArray[2];
		
		int minProductOf2 = intArray[0] * intArray[1];
		int maxProductOf2 = intArray[0] * intArray[1];
		
		int max = Math.max(intArray[0], intArray[1]);
		int min = Math.min(intArray[0], intArray[1]);
		
		for(int i = 2; i < intArray.length; i++) {
			int currentInt = intArray[i];
			
			maxProductOf3 = Math.max(
					Math.max(maxProductOf3, currentInt * maxProductOf2), currentInt * minProductOf2);
			
			maxProductOf2 = Math.max(
					Math.max(maxProductOf2, max * currentInt), min * currentInt);
			minProductOf2 = Math.min(
					Math.min(minProductOf2, max * currentInt), min * currentInt);
			
			max = Math.max(max, currentInt);
			min = Math.min(min, currentInt);
		}
		
		return maxProductOf3;
	}
}
