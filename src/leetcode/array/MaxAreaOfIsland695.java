package leetcode.array;

/**
 * @program: leetcode
 * @name: 695. Max Area of Island
 * @description: Given a non-empty 2D array grid of 0's and 1's,
 * an island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.)
 * You may assume all four edges of the grid are surrounded by water.
 * Find the maximum area of an island in the given 2D array. (If there is no island, the maximum area is 0.)
 * @author: Mr.Hugh
 * @create: 2018-03-07 19:51
 **/

class Solution7 {
    int high,wide;
    public int maxAreaOfIsland(int[][] grid) {
         high=grid.length;      //区域的高
         wide=grid[0].length;   //区域的宽

        int area=0,max=0;
        for(int i=0;i<high;i++){
            for(int j=0;j<wide;j++){
                if(grid[i][j]==1){
                    area=dfs(i,j,0,grid);   //注意此处area应该传值0，如传area，则会接着上次的面积累加计算
                    max=Math.max(area,max);     //比较得出最大的区域
                }
            }
        }
        return max;
    }
    //深度遍历，找周围链接着的大陆1，找到之后并将1置为0，以免死循环
    private int dfs(int i,int j,int area,int[][] grid){
        if(i<0||i>=high||j<0||j>=wide||grid[i][j]==0){  //不满足条件
            return area;
        }
        area++;
        grid[i][j]=0;   //查到过的区域置为0

        area=dfs(i+1,j,area,grid); //向下遍历
        area=dfs(i-1,j,area,grid);  //向上遍历
        area=dfs(i,j+1,area,grid);  //向右遍历
        area=dfs(i,j-1,area,grid);  //向左遍历
        return area;
    }
}


public class MaxAreaOfIsland695 {
    public static void main(String[] args) {
        Solution7 s=new Solution7();
        int[][] area={{0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        System.out.println(s.maxAreaOfIsland(area));
    }
}
