package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//效率太低
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//    	int[] result=new int[2];
//    	
//    	if(nums.length<2)
//    		return result;
//    	
//    	for (int i = 0; i < nums.length; i++) {
//			for (int j = i+1; j < nums.length; j++) {
//				if(nums[i]+nums[j]==target) {
//					result[0]=i;
//					result[1]=j;
//				}
//			}
//		}
//    	return result;
//    }
//}



class Solution26 {
    public int[] twoSum(int[] numbers, int target) {
       int[] result = new int[2];
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < numbers.length; i++){
	        if (map.containsKey(target - numbers[i])) {
	            result[1] = i;
	            result[0] = map.get(target - numbers[i]);
	            return result;
	        }
	        map.put(numbers[i], i);
	    }
	    return result;
    }
}



public class TwoSum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution26 s= new Solution26();
		int[] num= {2,7,11,15};
		int[] res=s.twoSum(num, 9);
		for(int i:res) {
			System.out.println(i);
		}
	}
}
