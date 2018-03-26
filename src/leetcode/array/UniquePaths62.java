package leetcode.array;

/**
 * @program: leetcode
 * @description: A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * The robot can only move either down or right at any point in time.
 * The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * How many possible unique paths are there?
 * @author: Mr.Hugh
 * @create: 2018-03-26 21:37
 **/

//https://blog.csdn.net/xygy8860/article/details/46892787
class Solution18 {
    public int uniquePaths(int m, int n) {

        //本题解法为动态规划
        //状态转移方程f[i][j] = f[i-1][j] + f[i][j-1];
        //f[i][j]的值即为路径的数量

        int[][] f = new int[m][n];
        for(int i = 0; i < m ; i++)//第一列赋值为1
            f[i][0] = 1;
        for(int i = 0; i < n; i++)//第一行赋值为1
            f[0][i] = 1;

        //从后往前推
        for(int i = 1; i < m ; i++)
            for(int j = 1; j < n ; j++){
                f[i][j] = f[i-1][j] + f[i][j-1];
                //System.out.println("f[" + i +"][" + j+ "]" + f[i][j]);
            }
        return f[m-1][n-1];//返回结果值
    }
}

public class UniquePaths62 {
    public static void main(String[] args) {
        Solution18 s = new Solution18();
        System.out.println(s.uniquePaths(3,2));
    }


}
