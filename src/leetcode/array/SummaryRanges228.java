package leetcode.array;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @description: Summary Ranges Total Accepted: 511 Total Submissions: 2271 Given a sorted integer array without duplicates, return the summary of its ranges.
 * @author: Mr.Hugh
 * @create: 2018-03-28 14:16
 **/

//public class Solution {
//    // [0,1,2,4,5,7], return ["0->2","4->5","7"].
//    public List<String> summaryRanges(int[] nums) {
//        List<String> res = new ArrayList<>();
//        if(nums==null || nums.length<1) return  res;
//
//        int s=0, e=0;
//        while(e<nums.length) {
//            if(e+1<nums.length && nums[e+1]==nums[e]+1) {
//                e++;
//            } else {
//                if(s==e) {
//                    res.add(Integer.toString(nums[s]));
//                } else {
//                    String str = nums[s] + "->" + nums[e];
//                    res.add(str);
//                }
//                ++e;
//                s = e;
//            }
//        }
//        return res;
//    }
//}



class Solution20 {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<String>();
        if (nums==null || nums.length<1){
            return result;
        }

        int start=0,end=0;
        while (end<nums.length){
            if (end+1<nums.length && nums[end]+1==nums[end+1]){
                    end++;
            }else {
                if(end==start){
                    result.add(Integer.toString(nums[start]));
                }else{
                    String str = nums[start]+"->"+nums[end];
                    result.add(str);
                }
                end++;
                start=end;
            }
        }
        return result;
    }
}

public class SummaryRanges228 {
    public static void main(String[] args) {
        Solution20 s= new Solution20();
        int[] num={1,2,3,6,8,9};
        s.summaryRanges(num);
    }
}
