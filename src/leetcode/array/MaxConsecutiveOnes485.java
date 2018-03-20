package leetcode.array;

/**
 * @program: leetcode
 * @description: Given a binary array, find the maximum number of consecutive 1s in this array.
 * @author: Mr.Hugh
 * @create: 2018-03-20 20:35
 **/

class Solution13 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum=0,max=0;
        for (int i=0;i<nums.length;i++){

            if (nums[i]==1){
                sum++;
            }else{
                max=Integer.max(sum,max);
                sum=0;
            }

        }
        max=Integer.max(sum,max);
        return max;
    }
}


public class MaxConsecutiveOnes485 {
    public static void main(String[] args) {
        Solution13 s=new Solution13();
        int[] num={1};

        System.out.println(s.findMaxConsecutiveOnes(num));

    }
}
