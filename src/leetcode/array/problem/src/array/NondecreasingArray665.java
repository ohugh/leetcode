package array;

//已经是一个非递减的数组，只有一个不规矩的元素，且该元素两边的数 中有空位，
//只有这样的数组才能通过一个值的改变来变成非递减数组
//https://blog.csdn.net/u011809767/article/details/77621955
class Solution9 {
    public boolean checkPossibility(int[] nums) {

       boolean modified = false;
       for (int i = 1; i < nums.length; i++) {
           if (nums[i] < nums[i - 1]) {
               if (modified) return false;
               if(i - 2 < 0 || nums[i - 2] <= nums[i])
            	    nums[i - 1] = nums[i];
               else
            	   nums[i] = nums[i - 1];
               modified = true;
           }
       }
       return true;
     }
}

public class NondecreasingArray665 {
	public static void main(String[] args) {
		Solution9 s = new Solution9();
		int[] num= {1,4,6,2,8};
		System.out.println(s.checkPossibility(num));
	}
}
