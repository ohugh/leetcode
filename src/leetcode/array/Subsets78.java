package leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @description: Given a set of distinct integers, nums, return all possible subsets (the power set).
 * @author: Mr.Hugh
 * @create: 2018-03-23 13:21
 **/
//https://blog.csdn.net/happyaaaaaaaaaaa/article/details/51604217
//他解 采用回溯法，也就是 采用循环和递归 嵌套结合的方式 做出来的
class Solution15 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        dfs(res, temp, nums, 0);
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> temp, int[] nums, int j) {
        res.add(new ArrayList<Integer>(temp));
        for(int i = j; i < nums.length; i++) {
            temp.add(nums[i]);  //① 加入 nums[i]
            dfs(res, temp, nums, i + 1);  //② 递归
            temp.remove(temp.size() - 1);  //③ 移除 nums[i]
        }
    }
}



public class Subsets78 {
    public static void main(String[] args) {
        Solution15 s = new Solution15();
        int[] num={1,2,3};
        System.out.println(s.subsets(num));
    }
}
