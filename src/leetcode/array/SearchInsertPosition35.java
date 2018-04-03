package leetcode.array;

/**
 * @program: leetcode
 * @description: Given a sorted array and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 * @author: Mr.Hugh
 * @create: 2018-04-03 18:21
 **/


class Solution24 {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        for (i = 0; i < nums.length && target>nums[i]; i++) {
        }
        return i;
    }
}

public class SearchInsertPosition35 {
    public static void main(String[] args) {
        Solution24 s = new Solution24();
        int[] num={1,3,5,6};
        System.out.println(s.searchInsert(num,5));
    }

}
