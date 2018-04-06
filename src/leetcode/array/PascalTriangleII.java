package array;

import java.util.ArrayList;

/**
 * 他解
 * 由于杨辉三角的每个位置的值 是上一行的该位置下标的值加上上一行该位置下标减一的值 ，
 * 所以在对每行进行覆盖重写时 应该选择从后往前的顺序写
 * @author hugh
 *
 */
class Solution1 {
	public ArrayList<Integer> getRow(int rowIndex) {
	    ArrayList<Integer> res = new ArrayList<Integer>();
	    if(rowIndex<0)
	        return res;
	    res.add(1);
	    for(int i=1;i<=rowIndex;i++)
	    {
	        for(int j=res.size()-2;j>=0;j--)
	        {
	            res.set(j+1,res.get(j)+res.get(j+1));
	        }
	        res.add(1);
	    }
	    return res;
	}
}


/**
 * 自解
 * 思路和上面的一样，相比来说更易理解一些
 * @author hugh
 *
 */
class solution2{
	public ArrayList<Integer> getRow(int rowIndex) {
		ArrayList<Integer> res= new ArrayList<>();
		
		if(rowIndex<0) {
			return res;
		}
		
		res.add(1);
		for (int i = 1; i <= rowIndex; i++) {
			for(int j=res.size()-1;j>0;j--) {
				res.set(j, res.get(j-1)+res.get(j));
			}
			res.add(1);
		}
		return res;
		
	}
}

/**
 * 运行测试，输出结果
 * @author hugh
 *
 */
public class PascalTriangleII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution2 s = new solution2();
		System.out.println(s.getRow(3).toString());
	}
}
