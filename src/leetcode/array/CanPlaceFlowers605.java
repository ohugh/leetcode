package array;

import java.util.ArrayList;
import java.util.List;



/**
 * Suppose you have a long flowerbed in which some of the plots are planted and some are not. 
 * However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.
 * 
 * Given a flowerbed (represented as an array containing 0 and 1,
 * where 0 means empty and 1 means not empty), and a number n, 
 * return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.
 * @author hugh
 *
 *
 * https://blog.csdn.net/thesnowboy_2/article/details/75313458
 */

class Solution8 {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
	    int count = 1;
	    int result = 0;
	    for(int i=0; i<flowerbed.length; i++) {
	        if(flowerbed[i] == 0) {
	            count++;
	        }else {
	            result += (count-1)/2;
	            count = 0;
	        }
	    }
	    if(count != 0) result += count/2;
	    return result>=n;
	}
}


public class CanPlaceFlowers605 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] num= {1,0,0,0,1};
		Solution8 s= new Solution8();
		System.out.println(s.canPlaceFlowers(num, 1));
		
	}

}
