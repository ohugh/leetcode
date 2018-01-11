package leetcode.array;

import java.util.Arrays;

/**
 * @program: leetcode
 * @description: 581. Shortest Unsorted Continuous Subarray
 * Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order,
 * then the whole array will be sorted in ascending order, too.  You need to find the shortest such subarray and output its length.
 * @author: Mr.Hugh
 * @create: 2018-01-11 16:00
 **/

//他解
//    目标是从大到小排列，从两头开始找，对于有序的部分掠过，对于不在顺序之中的部分下标标记。
//class Solution1 {
//    public int findUnsortedSubarray(int[] nums) {
//        int n=nums.length,beg =-1,end=-2,mn=nums[n-1],mx=nums[0];
//        for(int i=1;i<n;i++){
//            mx=Math.max(mx,nums[i]);
//            mn = Math.min(mn, nums[n-1-i]);
//            if (nums[i]<mx) end=i;
//            if(nums[n-1-i]>mn) beg=n-1-i;
//        }
//        return end-beg+1;
//    }
//}

//自解
//目标是从小到大排列，先将数组拷贝之后排序，然后把有序数组与原数组 相同位置进行比较，
// 同一个位置 值不同的话，则说明该位置无须，需要标记
class Solution1 {
    public int findUnsortedSubarray(int[] nums) {
//        拷贝数组，并将数组复制
        int[] copy = new int[nums.length];
        copy = (int[]) nums.clone();

//        数组排序
        Arrays.sort(copy);

//        从两头分别找出与排序好的元素值不同的元素下标
        int start=0, end=nums.length-1;
        for (; start < nums.length; start++) {
            if (nums[start]!=copy[start])   break;
        }
        for (; end >start; end--) {
            if (nums[end]!=copy[end])   break;
        }
        return end-start+1;
    }
}


public class ShortestUnsortedContinuousSubarray {
    public static void main(String args[]) {
        Solution1 s = new Solution1();
        int[] num = {5, 1, 2, 3, 4};
        System.out.println(s.findUnsortedSubarray(num));
    }
}
