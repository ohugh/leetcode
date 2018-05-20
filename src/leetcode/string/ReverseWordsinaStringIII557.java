package leetcode.string;

/**
 * @program: leetcode
 * @description: Given a string, you need to reverse the order of characters in each word within a sentence
 * while still preserving whitespace and initial word order.
 * @author: Mr.Hugh
 * @create: 2018-05-20 17:04
 **/

//自解 253ms 特别慢
//class Solution {
//    public String reverseWords(String s) {
//       // System.out.println(s + "->" + new StringBuilder(s).reverse());  //reverse()方法并不会改变原字符串
//        String res="";
//        String[] get= s.split(" ");
//        for (int i=0;i<get.length;i++){
//            res=res+new StringBuilder(get[i]).reverse();
//            if (i<get.length-1){
//                res+=" ";
//            }
//        }
//        return res;
//    }
//}

//他解 12ms  相比起来，自己的解法是慢在了 每个单词后面增加空格的判断上了
class Solution {
    public String reverseWords(String s) {
        StringBuilder str = new StringBuilder();
        String[] splits = s.split(" ");  //split() 将字符串分割
        for(String split : splits){
            String rev = new StringBuilder(split).reverse().toString();   //reverse()函数 将string倒置过来
            str.append(rev); //往动态数组里面加入
            str.append(" ");
        }
        return str.toString().trim();  //trim()返回调用字符串对象的一个副本，但是所有起始和结尾的空格都被删除了
    }
}

public class ReverseWordsinaStringIII557 {
    public static void main(String[] args) {
        String res=new Solution().reverseWords("as da sd");
        System.out.println(res);
    }
}
