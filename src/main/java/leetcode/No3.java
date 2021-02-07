package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: zhaochao
 * @Date: 2021/2/7 19:22
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * 示例 4:
 * <p>
 * 输入: s = ""
 * 输出: 0
 *  
 * <p>
 * 提示：
 * <p>
 * 0 <= s.length <= 5 * 104
 * s 由英文字母、数字、符号和空格组成
 */
public class No3 {

    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        //todo 优化
        char[] chars = s.toCharArray();
        int longest = 0;
        for (int i = 0; i < s.length(); i++)
            for (int j = i; j < s.length(); j++) {
                if (set.contains(chars[j])) {
                    set.clear();
                    break;
                } else {
                    set.add(chars[j]);
                    longest = longest > set.size() ? longest : set.size();
                }
            }
        return longest;
    }
}
