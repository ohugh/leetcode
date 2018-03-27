package leetcode.array;

/**
 * @program: leetcode
 * @description: Given an unsorted array of integers, find the length of longest continuous increasing subsequence (subarray).
 * @author: Mr.Hugh
 * @create: 2018-03-27 19:23
 **/

class Solution19 {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length<2){
            return nums.length;
        }

        int maxLength=1,len=1;

        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i+1]>nums[i]){
                len++;
            }else{
                len=1;
            }
            maxLength=Integer.max(maxLength,len);
        }

        return maxLength;
    }
}

public class LongestContinuousIncreasingSubsequence674 {
    public static void main(String[] args) {
        Solution19 s = new Solution19();
        int[] num={1,3,5,7};
        System.out.println(s.findLengthOfLCIS(num));
    }
}
