package leetcode.array;

import java.util.Arrays;

/**
 * @program: leetcode
 * @description: Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.  You may assume that the array is non-empty and the majority element always exist in the array.
 * @author: Mr.Hugh
 * @create: 2018-03-15 23:44
 **/
class Solution12 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}

public class MajorityElement169 {
    public static void main(String[] args) {
        Solution12 s=new Solution12();
        int[] num={1,1,2,2,2};
        System.out.println(s.majorityElement(num));
    }
}
