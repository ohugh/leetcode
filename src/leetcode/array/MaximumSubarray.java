package leetcode.array;

/**
 * @program: leetcode
 * @description: Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4], the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 * @author: Mr.Hugh
 * @create: 2018-01-13 18:32
 **/

/*todo 他解，暂时放下
class Solution2{
    public int maxSubArray(int[] nums){

    }
}
*/

//通过看他人博客得出的
class Solution2{
    public int maxSubArray(int[] nums)
    {
        if(nums == null || nums.length == 0)
            return 0;

        int sum = 0;
        int max = Integer.MIN_VALUE;    //最初保证max是比所给数字还小的数字

        for (int i = 0; i < nums.length; i++){
            // 当前数 与 当前数与sum的和 相比，
            // 如果当前数 比两者之和还要大的话，说明前面的sum为负数，相加是没有意义的（此时的和从当前数开始计算）
            sum = Math.max(nums[i], sum + nums[i]);
            max = Math.max(max, sum);    //之前的最大值与现阶段的和相比，选择更大的那个
        }

        return max;
    }
}


public class MaximumSubarray {
    public static void main(String[] args) {

        Solution2 s=new Solution2();

        //测试数据
        int array[]={-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(s.maxSubArray(array));
    }

}

