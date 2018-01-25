package leetcode.array;

/**
 * @program: leetcode：566. Reshape the Matrix
 * @description: In MATLAB, there is a very useful function called ‘reshape’,
     * which can reshape a matrix into a new one with different size but keep its original data.
     * You’re given a matrix represented by a two-dimensional array, and two positive integers r and c
     * representing the row number and column number of the wanted reshaped matrix, respectively.
     * The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.
     * If the ‘reshape’ operation with given parameters is possible and legal, output the new reshaped matrix;
     * Otherwise, output the original matrix.
 * @author: Mr.Hugh
 * @create: 2018-01-24 21:57
 **/
public class ReshapeTheMatrix {
    public static void main(String[] args) {
        Solution3 t= new Solution3();

        int num[][]={{1,2,3},{4,5,6}};  //测试数据
        int [][]res=t.matrixReshape(num,3,2);

        for (int[] t1:res){         //循环读取数据
            for (int t2:t1){
                System.out.println(t2);
            }
            System.out.println("----");
        }

    }
}


//自解 用时8ms
class Solution3 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {

        int sum = nums[0].length * nums.length; //根据题意，先要判断原数组长度和 变形完后的数组长度是否一致。
        if( sum!= r*c){
            return nums;
        }

        int[][] result=new int[r][c];
        int x=0,y=-1;   //由于在下面要先执行y++，且数组从0开始，所以要初始化为-1

        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums[i].length;j++){

                if (i*nums[i].length+j+1<=(x+1)*c){     //判断当前所在位置的长度是否 超过了 目标数组的现有长度
                    y++;
                    result[x][y]=nums[i][j];
                }

                else{
                    x++;            //超过的话，目标数组就要另起一行开始
                    y=0;
                    result[x][y]=nums[i][j];
                }

            }
        }
        return result;
    }
}

//最短时间解   用时6ms
// 两个代码的思路其实是一样的，对比两个代码可见，合并代码，减少代码量，有助于减少运行时间

//class Solution {
//    public int[][] matrixReshape(int[][] nums, int r, int c) {
//        if(r == 0 || c == 0){
//            return nums;
//        }
//
//        if((r * c) != (nums.length * nums[0].length)){
//            return nums;
//        }
//
//        int[][] arr = new int[r][c];
//        int row = 0, col = 0;
//
//        for(int i = 0; i < nums.length; i++){
//            for(int j = 0; j < nums[i].length; j++){
//                arr[row][col++] = nums[i][j];
//                if(col >= c){
//                    row++;
//                    col = 0;
//                }
//            }
//        }
//        return arr;
//    }
//}