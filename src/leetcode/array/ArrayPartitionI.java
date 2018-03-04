package leetcode.array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @program: leetcode
 * @name 561. Array Partition I
 * @description: Given an array of 2n integers, your task is to group these integers into n pairs of integer,
 * say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 * Example 1: Input: [1,4,3,2]  Output: 4 Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
 * @author: Mr.Hugh
 * @create: 2018-03-04 16:15
 **/

class Solution4 {
    public int arrayPairSum(int[] nums) {
        int sum=0;
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i=i+2 ){
            sum=sum+nums[i];
        }
        return sum;
    }
}

public class ArrayPartitionI {
    public static void main(String[] args) {
        int[] num={1,4,3,2};
        System.out.println(new Solution4().arrayPairSum(num));
    }
}

