package leetcode.code.simple.No257深度遍历;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaochao
 * @date 2021/5/29 11:54
 */
public class Solution {

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> paths = new ArrayList<>();
        constructPaths(root, "", paths);
        return paths;
    }


    public void constructPaths(TreeNode root, String path, List<String> paths) {
        if (root != null) {
            StringBuffer pathSB = new StringBuffer(path);
            pathSB.append(Integer.toString(root.val));
            if (root.left == null && root.right == null) {  // 当前节点是叶子节点
                paths.add(pathSB.toString());  // 把路径加入到答案中
            } else {
                pathSB.append("->");  // 当前节点不是叶子节点，继续递归遍历
                constructPaths(root.left, pathSB.toString(), paths);
                constructPaths(root.right, pathSB.toString(), paths);
            }
        }
    }

}

