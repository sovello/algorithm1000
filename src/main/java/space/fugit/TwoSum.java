package space.fugit;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	/*
	 * Given an array of integers, return indices of the 
	 * two numbers such that they add up to a specific target.
	 * You may assume that each input would have exactly one 
	 * solution, and you may not use the same element twice.
	 */
    public static int[] getTwoSum(int[] nums, int target) {
        int[] indices = new int[2];
        for( int i =0; i < nums.length - 1; i++ ){
            for( int j = 0; j < nums.length; j++){
                if( nums[i]+nums[j] == target){
                    if( i != j){
                        indices[0] = i;
                        indices[1] = j;
                        return indices;
                    }
                }
            }
        }
        return indices;
    }
    
    public static int[] getTwoSumMap(int[] nums, int target) {
    	Map<Integer, Integer> sums = new HashMap<Integer, Integer>();
        for( int i = 0; i < nums.length; i++ ){
        	if( sums.containsKey(target - nums[i])) {
            	return new int[] {sums.get(target - nums[i]), i};
            }
        	sums.put(nums[i], i);
        }
        return new int[] {};
    }
    
    public static int[] getTwoSumSorted(int[] numbers, int target) {
        Map<Integer, Integer> valueKeys = new HashMap<Integer, Integer>();
        for( int i = 0; i < numbers.length; i++){
            if(valueKeys.containsKey(target - numbers[i])){
                return new int[] { valueKeys.get(target-numbers[i])+1, i+1};
            }
            valueKeys.put(numbers[i], i);
        }
         return new int[] {};
    }
}
