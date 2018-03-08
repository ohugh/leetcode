package leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @name: 448. Find All Numbers Disappeared in an Array
 * @description: Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array),
 * some elements appear twice and others appear once.
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 * @author: Mr.Hugh
 * @create: 2018-03-08 14:44
 **/

//思路：无论数字的位置在哪里，能改变数组对应下标数字正负的 只有那一个数字，只要正负没变，就说明对应的 数字不存在

//他解 思路与下面的差不多，只是这个多开辟了一个数组标记空间，用来指明该位置是否有对应的数存在
class Solution8 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> a=new ArrayList();
        int n=nums.length;
        boolean array[]= new boolean[n+1];
        for(int i=0;i<n;i++)
        {
            array[nums[i]]=true;

        }
        for(int i=1;i<=n;i++)
        {
            if(array[i]==false)
                a.add(i);

        }
        return a;

    }
}

//自解
//class Solution8 {
//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        List<Integer> result=new ArrayList<Integer>();
//        for (int i = 0; i <nums.length ; i++) {
//            int index=Math.abs(nums[i])-1;      //在此使用绝对值，因为后面从下标可能在前面被标记为负数，所以要先取绝对值
//            if(nums[index]>0){          //此处可以换成三目运算符
//                nums[index]=-nums[index];
//            }
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]>0){
//                result.add(i+1);
//            }
//        }
//        return result;
//    }
//}

public class FindAllNumbersDisappearedInAnArray448 {
    public static void main(String[] args) {
        int[] num={4,3,2,7,8,2,3,1};
        Solution8 s=new Solution8();
        List<Integer> get=s.findDisappearedNumbers(num);
        for (Integer out:get){
            System.out.println(out);
        }

    }
}
