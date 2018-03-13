package leetcode.array;

/**
 * @program: leetcode
 * @name: 167. Two Sum II - Input array is sorted
 * @description: Given an array of integers that is already sorted in ascending order,
 * find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based
 * .  You may assume that each input would have exactly one solution and you may not use the same element twice.
 * Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
 * @author: Mr.Hugh
 * @create: 2018-03-13 17:47
 **/

//我原来的想法是通过for循环两层遍历，然后逐一相加对比目标数字，可是感觉效率太低
//    这个方法以前看过，但是做题是并没有想到，旧事重提一下
//    https://www.cnblogs.com/ganganloveu/p/4198968.html
class Solution11 {
    public int[] twoSum(int[] numbers, int target) {
        int left=0,right=numbers.length-1;

        int sum;
        int[] result=new int[2];

        while (left<right){
            sum=numbers[left]+numbers[right];
            if (sum==target){
                result[0]=left+1;
                result[1]=right+1;
                break;
            }

            if (sum<target)
                left++;
            else
                right--;
        }
        return result;
    }
}
public class TwoSumIIInputArrayIsSorted167 {
    public static void main(String[] args) {
        Solution11 s=new Solution11();
        int[] num={2, 7, 11, 15};
        int[] res=s.twoSum(num,9);
        for (int i:res)
            System.out.println(i);
    }
}
