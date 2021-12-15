/**
 * @author 伊莫
 */
public class Solution {
    /**
     *   you need to treat n as an unsigned value
     */
    public int hammingWeight(int n) {
        int res = 0;
            while (n != 0){
                res = (n & 1) == 1? res+1 : res;
                //无符号右移
                n = n >>> 1 ;
            }
            return res;
    }
    public static void main(String[] args) {
        Solution so = new Solution();
        int i = so.hammingWeight(-3);
        System.out.println("i = " + i);
    }

}
