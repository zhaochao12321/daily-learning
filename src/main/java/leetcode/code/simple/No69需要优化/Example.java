package leetcode.code.simple.No69需要优化;

/**
 * @author zhaochao
 * @date 2021/5/14 15:42
 *
 *
 * 由于 xx 平方根的整数部分 \textit{ans}ans 是满足 k^2 \leq xk
 * 2
 *  ≤x 的最大 kk 值，因此我们可以对 kk 进行二分查找，从而得到答案。
 *
 * 二分查找的下界为 00，上界可以粗略地设定为 xx。在二分查找的每一步中，我们只需要比较中间元素 \textit{mid}mid 的平方与 xx 的大小关系，并通过比较的结果调整上下界的范围。由于我们所有的运算都是整数运算，不会存在误差，因此在得到最终的答案 \textit{ans}ans 后，也就不需要再去尝试 \textit{ans} + 1ans+1 了。
 */
public class Example {

    public int mySqrt(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }




}
