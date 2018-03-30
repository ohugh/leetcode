package leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: leetcode
 * @description: 给定 numRows, 生成帕斯卡三角形的前 numRows 行。  例如, 给定 numRows = 5,
 * @author: Mr.Hugh
 * @create: 2018-03-30 20:05
 **/

//https://www.cnblogs.com/zzchit/p/5859033.html
class Solution22 {
    public List<List<Integer>> generate(int numRows) {
        if(numRows < 0) return null;
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i = 0; i < numRows; i++){
            List<Integer> eachRow = new ArrayList<Integer>();
            eachRow.add(0, 1); //每一行的第一个元素为1
            for(int j = 1; j < i; j++){
                if(i-1 >= 0){
                    List<Integer> last = result.get(i-1);
                    int num = last.get(j-1) + last.get(j); //根据性质
                    eachRow.add(j, num);
                }

            }
            if(i > 0) eachRow.add(i, 1); //每一行的最后一个元素为1
            result.add(i,eachRow);
        }
        return result;
    }
}


public class PascalTriangle118 {
    public static void main(String[] args) {
        Solution22 s = new Solution22();
        int row=4;
        List<List<Integer>> res = s.generate(row);
        System.out.println(res);

    }
}
