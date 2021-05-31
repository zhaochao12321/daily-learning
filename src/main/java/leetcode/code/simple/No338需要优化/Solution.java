package leetcode.code.simple.No338需要优化;

/**
 * @author zhaochao
 * @date 2021/5/31 12:01
 * 先用笨办法做一遍，然后看后面的解析，学习好的办法
 *
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] data=   solution.countBits(5);
        System.out.println("");
    }


    /**
     * low逼方法注释调，现在去看看牛逼方法
     * @param n
     * @return
     */
//    public int[] countBits(int n) {
//
//
//        int[] data =new int[n+1];
//        for (int i =0;i<n+1;i++){
//
//            int m=0;
//            data[i]=digui(i,m);
//
//        }
//            return data;
//    }
//
//    private int digui(int i,int m) {
//        if (i==0){
//            return m;
//        }
//        else if (i%2==1){
//            m++;
//        }
//
//        return digui(i/2,m);
//
//    }

    /**
     *
     * @param n
     * @return
     * Brian Kernighan 算法的原理是：对于任意整数 xx，令 x=x & (x−1)，该运算将 xx 的二进制表示的最后一个 11 变成 00。
     * 因此，对 xx 重复该操作，直到 xx 变成 00，则操作次数即为 xx 的「一比特数」。
     *
     */
    public int[] countBits(int n) {
        int[] bits = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            bits[i] = countOnes(i);
        }
        return bits;
    }

    public int countOnes(int x) {
        int ones = 0;
        while (x > 0) {
            x &= (x - 1);
            ones++;
        }
        return ones;
    }

}
