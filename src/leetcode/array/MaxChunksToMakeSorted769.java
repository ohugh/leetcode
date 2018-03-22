package leetcode.array;

/**
 * @program: leetcode
 * @description: Given an array arr that is a permutation of [0, 1, ..., arr.length - 1],
 * we split the array into some number of "chunks" (partitions), and individually sort each chunk.
 * After concatenating them, the result equals the sorted array.
 * @author: Mr.Hugh
 * @create: 2018-03-22 13:28
 **/
//他人的解答方法，比较巧妙，理解深度还不够，需要再多看几遍博客
//    http://blog.csdn.net/liuchuo/article/details/79187214

    /*
    分析：因为数组的排序后正确顺序应该是arr[i]处的数是i。所以，遍历数组，每次将最大的那个值标记为maxn，
            maxn必须在i处才能满足对0～i数字排序后能够恰好是正确的位置，此时ans+1，表示前面的可以组为一个“块”，
            最后ans即为所求的值

            再解释详细些：maxn是第0～i个数字中的最大值，遍历的过程中如果maxn==i，
            就保证了前面i-1个数字必然都比maxn小（因为maxn是0～i中的最大值），则第0～i个数字必然能排列成正确顺序，以此类推，
            找到下一个满足maxn==i的地方（记为j），则i+1～j又能分为一个块…直到遍历到最后一个数为止得到答案～
    */

class Solution14 {
    public int maxChunksToSorted(int[] arr) {
                int ans = 0;
                for (int i = 0, maxn = 0; i < arr.length; i++) {
                    maxn = Integer.max(arr[i], maxn);
                    if (maxn == i) ans++;    //每次都是对当前遍历到的最大数 进行判断，如果当前最大数 到了它所对应下标的位置，
                                            // 则说明前面的数都比他小，此时可以为一个分组
                }
                return ans;
    }
}
public class MaxChunksToMakeSorted769 {

    public static void main(String[] args) {
        Solution14 s= new Solution14();
        int[] num={1,0,2,4,3};
        System.out.println(s.maxChunksToSorted(num));
    }

}

