package leetcode.array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @program: leetcode
 * @description: 给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)
 * @author: Mr.Hugh
 * @create: 2018-03-31 19:22
 **/

//自解：因为sort排序是 从小到大，所以要从后往前来找第三个 不同的数字
class Solution23 {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if (nums.length==1){    //如果只有一个数，就返回
            return nums[0];
        }
        if (nums.length==2){        //如果有两个数，根据题意 返回较大的那个数字
            return Integer.max(nums[0],nums[1]);
        }

        int start=nums.length-1,        //此变量是指代当前数的下标，起始值从最后一个数的下标开始
                end=nums.length-3,      //此变量是指代应该停止的的位置下标
                count=0;                //记录有效移动的次数（有效移动两次 ，即可证明下个数是第三个较大的数字）
        while (start>end && start>=0 && end>=0){
            if (nums[start]!=nums[start-1]){    //当前位置和下一个位置的数字不一样大
                start--;    //当前位置 向end目标位置移动
                count++;    //有效移动了一次
            }else {         //当前位置和下一个位置的数字是一样大的
                start--;    //跳过当前位置
                end--;      //应该停止的位置下标往前挪一个位置
            }
        }
        if (count!=2){          //有效移动不满两次，说明不同的数字 不够三个，此时返回最大的那个数字
            return nums[nums.length-1];
        }
        return nums[start];
    }
}

public class ThirdMaximumNumber414 {
    public static void main(String[] args) {
        Solution23 s = new Solution23();
        int[] num={1,1,2};
        System.out.println(s.thirdMax(num));
    }

}
