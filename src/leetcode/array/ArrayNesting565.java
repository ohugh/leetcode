package leetcode.array;

/**
 * @program: leetcode
 * @name: 565. Array Nesting
 * @description: A zero-indexed array A of length N contains all integers from 0 to N-1.
 * Find and return the longest length of set S, where S[i] = {A[i], A[A[i]], A[A[A[i]]], ... } subjected to the rule below.
 * Suppose the first element in S starts with the selection of element A[i] of index = i,
 * the next element in S should be A[A[i]], and then A[A[A[i]]]… By that analogy,
 * we stop adding right before a duplicate element occurs in S.
 * @author: Mr.Hugh
 * @create: 2018-03-10 21:00
 **/

//他解:思路跟我的一样，只不过将标记元素统记为-1，且在判断进循环时 没有多余的判断，所以用时更短
class Solution10 {
    public int arrayNesting(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=-1){        //每条链是以 -1结束的
                int cnt = 0;
                int t = i;
                while(nums[t]!=-1){
                    cnt++;
                    int k = nums[t];
                    nums[t] = -1;
                    t = k;
                }
                max = Math.max(max,cnt);
            }
        }
        return max;
    }
}


//短暂的思路，从下标0开始，一直找到最后，并将沿途的 经过的数字变成负数，
// 然后第二个从下一个正数开始 一直到最后，然后跟之前的max比较，一直到最后的一个元素
//class Solution10 {
//    public int arrayNesting(int[] nums) {
//        int max=-1;
//        for (int i = 0; i < nums.length; i++) {     //每条链的起点不能超过数组的最大长度
//            if (nums[i]<0)
//                continue;
//            int sum=0;    //每条链的长度，每次从头开始都要初始化一下
//            for (int j = i; j < nums.length; ) { //每条链，不能超过 数组的最大长度
//                if(nums[j]<0)
//                    break;
//                if (nums[j]==j){    //避免0元素在0下标处，从而无限循环
//                    sum=1;
//                    break;
//                }
//                nums[j]=-nums[j];//标记为负数，说明经过该点，不必再算以此数为头的链
//
//                j= -nums[j];//加负号 是为了保留下个正确的下标，在上步中数组的数已经变成负数了
//                sum++;
//            }
//            if (sum>max)
//                max=sum;
//        }
//        return max;
//    }
//}

public class ArrayNesting565 {
    public static void main(String[] args) {
        Solution10 s=new Solution10();
        int[] num={0,2,1,4,5,3};
        System.out.println(s.arrayNesting(num));
    }
}
