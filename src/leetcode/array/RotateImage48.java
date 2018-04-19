package leetcode.array;

import java.util.Arrays;

/**
 * @program: leetcode
 * @description: You are given an n x n 2D matrix representing an image.  Rotate the image by 90 degrees (clockwise).
 * @author: Mr.Hugh
 * @create: 2018-04-19 14:34
 **/



/**
 * 首先将矩阵沿着副对角线翻折，然后沿着水平中线翻折
 * https://blog.csdn.net/sunnyyoona/article/details/18566587
 */
class Solution28 {
    public void rotate(int[][] matrix) {
        int temp;
        int n=matrix.length;
        // 沿着副对角线反转
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n - i; ++j) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][n - 1 - i];
                matrix[n - 1 - j][n - 1 - i] = temp;
            }
        }
        // 沿着水平中线反转
        for (int i = 0; i < n / 2; ++i){
            for (int j = 0; j < n; ++j) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - i][j];
                matrix[n - 1 - i][j] = temp;
            }
        }
    }
}


public class RotateImage48 {
    public static void main(String[] args) {
        Solution28 s = new Solution28();
        int[][] num={
        {1,2,3},
        {4,5,6},
        {7,8,9}
        };
        s.rotate(num);
    }
}
