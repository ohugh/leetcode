package leetcode.array;

/**
 * @program: leetcode
 * @description: Given an array of integers nums, write a method that returns the "pivot" index of this array.
 * We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.
 * If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.
 * @author: Mr.Hugh
 * @create: 2018-04-08 14:19
 **/

/* 原本的想法太过繁杂，虽然也想的是设置left和right两个指针变量，但是原本打算是在大循环中（移动指针） 套两个循环（分别统计左右两边的和）
 * 参考https://blog.csdn.net/dongchengrong/article/details/78515012
 */
class Solution25 {
    public int pivotIndex(int[] nums) {
        int d = nums.length;

        if(d == 0)
            return -1;

        int left = nums[0], right = 0;
        for(int i = 0; i < d; i++)
            right += nums[i];
        if(left == right)   //数组所有数字之和 与第一个数字的大小一样大，说明数组就一个数
            return 0;

        for(int i = 1; i < d; i++)
        {
            left += nums[i];
            right -= nums[i - 1];
            if(left == right)
                return i;
        }
        return -1;
    }
}


public class FindPivotIndex724 {
    public static void main(String[] args) {
        Solution25 s = new Solution25();
        int[] num = {1, 7, 3, 6, 5, 6};
        System.out.println( s.pivotIndex(num));
    }
}
