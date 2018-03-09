package leetcode.array;

/**
 * @program: leetcode
 * @name: 238. Product of Array Except Self
 * @description: Given an array of n integers where n > 1, nums,
 * return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 * Solve it without division and in O(n).
 * @author: Mr.Hugh
 * @create: 2018-03-09 14:24
 **/

//解释博客：http://blog.csdn.net/xudli/article/details/46911603
//如果看不懂代码思路的话，可以带入一组数据，然后看看代码是如何运行的，慢慢就懂思路了
class Solution9 {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];   //构造对应的数组
        res[res.length-1] = 1;          //让数组最后一个数为1。为的是在后面算每个数右边乘积的数值时，乘积是不变的

        for(int i=nums.length-2; i>=0; i--) {   //从后往前，先算每个数右边的积
            res[i] = res[i+1] * nums[i+1];      //先将每个数右边的乘积，放到这个数位置上来
        }

        int left = 1;
        for(int i=0; i<nums.length; i++) {  //从前往后来，在原先数字右边乘积的基础上，再乘数字左边的乘积
            res[i] *= left;  //此处乘以左边的乘积
            left *= nums[i]; //此处算每个数字位置左边的乘积
        }
        return res; //结果返回
    }
}

//自解，应该是没有问题的，但是面对大量数据，响应时间就会超时 Time Limit Exceeded
//class Solution9 {
//    public int[] productExceptSelf(int[] nums) {
//        int l=nums.length;
//        int[] result=new int[l];    //新建的数组长度与原先相同
//
//        int i=0;//循环变量
//        int get=1;//乘机变量
//        for (int j = 0; j < nums.length; j++) {
//            if (i!=j){
//                get=get*nums[j];
//            }
//
//            if (j==nums.length-1){
//                j=-1;   //注意：此处如果接着往下循环的话，j会再++，为了让j=0，则此处置-1
//                result[i]=get;
//                get=1;
//                if (i==nums.length-1)
//                    break;
//                else
//                    i++;
//            }
//        }
//        return result;
//    }
//}

public class ProductOfArrayExceptSelf238 {
    public static void main(String[] args) {
        Solution9 s=new Solution9();
        int[] test={1,2,3,4};
        int[] res=s.productExceptSelf(test);
        for(int i:res){
            System.out.println(i);
        }
    }
}
