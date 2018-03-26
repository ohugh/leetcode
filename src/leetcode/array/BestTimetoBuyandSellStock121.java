package leetcode.array;

/**
 * @program: leetcode
 * @description: Say you have an array for which the ith element is the price of a given stock on day i.  If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 * @author: Mr.Hugh
 * @create: 2018-03-24 20:00
 **/

//可以参考这个博客https://blog.csdn.net/derrantcm/article/details/47651235
class Solution17 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 1) {
            return 0;
        }

        int lower=prices[0],price=0;

        for (int i=0;i<prices.length;i++){
            if (prices[i]<lower){
                lower=prices[i];
            }
            else{
                price=(price>prices[i]-lower)?price:prices[i]-lower;
            }

        }
        return price;
    }
}

public class BestTimetoBuyandSellStock121 {
    public static void main(String[] args) {
        Solution17 s=new Solution17();
        int[] num={1};
        System.out.println(s.maxProfit(num));
    }
}
