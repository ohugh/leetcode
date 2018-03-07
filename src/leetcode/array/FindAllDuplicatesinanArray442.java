package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: leetcode
 * @name: 442. Find All Duplicates in an Array
 * @description: Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array),
 * some elements appear twice and others appear once.  Find all the elements that appear twice in this array.
 * Could you do it without extra space and in O(n) runtime?
 *
 * @author: Mr.Hugh
 * @create: 2018-03-05 20:31
 **/
//他解
//class Solution {
//    public List<Integer> findDuplicates(int[] nums) {
//
//        List<Integer> result = new ArrayList<Integer> ();
//
//        for (int i = 0; i < nums.length; i++) {
//            int index = Math.abs(nums[i]) -1;
//            if (nums[index] < 0) {
//                result.add(Math.abs(nums[i]));
//            } else {
//                nums[index] = 0 - nums[index];
//            }
//        }
//
//        return result;
//
//    }
//}


//自解
class Solution6 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> out=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                out.add(nums[i]);
            }
        }
        return out;
    }
}


public class FindAllDuplicatesinanArray442 {
    public static void main(String[] args) {
        Solution6 s=new Solution6();
        int[] test={4,3,2,7,8,2,3,1};
        List<Integer> result = s.findDuplicates(test);
        for(Integer i:result){
            System.out.println(i);
        }


    }

}
