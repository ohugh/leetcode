package leetcode.array;

/**
 * @program: leetcode
 * @name: 766. Toeplitz Matrix
 * @description: A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same element.
 * Now given an M x N matrix, return True if and only if the matrix is Toeplitz.
 * http://blog.csdn.net/leafage_m/article/details/79157007
 * @author: Mr.Hugh
 * @create: 2018-03-04 16:43
 **/

//最简单的做法就是比较当前元素和对角线上的下一个元素是否相等即可，需要注意的是我们每行需要对比的元素可以除去最后一个。
class Solution5 {
    public boolean isToeplitzMatrix(int[][] matrix) {

    for(int i=0;i<matrix.length-1;i++) {
        for(int j=0;j<matrix[0].length-1;j++) {
            if(matrix[i][j] != matrix[i+1][j+1]) {
                return false;
            }
        }
    }
    return true;
    }
}

public class ToeplitzMatrix {
    public static void main(String[] args){
        int[][] matrix = {{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        System.out.println( new Solution5().isToeplitzMatrix(matrix));
    }
}
