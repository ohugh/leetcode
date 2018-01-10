package leetcode.array;

/**
 *      283.MoveZeroes
 *  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *  For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 *   Note:
 *   You must do this in-place without making a copy of the array.
 *   Minimize the total number of operations.
 *   @author 良
 */

//最优解
//class Solution {
//    public void moveZeroes(int[] nums) {
//        if(nums.length < 2) return;
//        int k = 0;
//        for(int i = 0; i < nums.length; i++) {
//            if(nums[i] != 0) {
//                nums[k++] = nums[i];
//            }
//        }
//        for(;k < nums.length; k++)
//            nums[k] = 0;


//        for (int i=0;i<nums.length;i++ )
//            System.out.print(nums[i]);
//    }
//}


//自解
class Solution {
    public void moveZeroes(int[] nums) {
        int j;
        for (int index = 0, current = 0; current < nums.length; current++) {
            if (nums[current] != 0){
                j=nums[index];
                nums[index]=nums[current];
                nums[current]=j;
                index++;
            }
        }
        for (int i=0;i<nums.length;i++ )
            System.out.print(nums[i]);
    }
}


public class MoveZeroes {
    public static void main(String[] args){
        Solution s=new Solution();
        int[] num={1,0,0,3,7,1,2,1,};
        s.moveZeroes(num);
    }
}
