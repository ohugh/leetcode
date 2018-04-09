package leetcode.array;

/**
 * @program: leetcode
 * @description: Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value.
 * And you need to output the maximum average value.
 * @author: Mr.Hugh
 * @create: 2018-04-09 19:30
 **/

/**
 * 原本的思路是两个for循环嵌套，一个控制往后推进，一个是控制把k个数字相加，但是考虑到循环嵌套的效率太低所以寻求了其他的思路
 *
 * 先算出前k个元素的sum，之后依次向右枚举，每次删掉最左边的元素，加上最右边的元素，
 * 相当于窗口移动，并在每次移动时，更新maxSum。当枚举结束后，返回 maxSum / k。
 */
class Solution27 {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxsum=sum;
        for (int i = 0; k+i < nums.length; i++) {
            sum=sum-nums[i]+nums[k+i];
            maxsum=Integer.max(sum,maxsum);
        }
        return (double) maxsum/k;
    }
}



public class MaximumAverageSubarrayI643 {
    public static void main(String[] args) {
        Solution27 s = new Solution27();
        int[] num={1,12,-5,-6,50,3};


        System.out.println(s.findMaxAverage(num,4));
    }


}
