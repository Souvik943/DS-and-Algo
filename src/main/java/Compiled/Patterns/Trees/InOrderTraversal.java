package Compiled.Patterns.Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {
    // Iterative Solution
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while(!stack.isEmpty() || node!=null) {
            while(node.left != null) {
                stack.push(node);
                node = node.left;
            }
            TreeNode poppedNode = stack.pop();
            res.add(poppedNode.val);
            node = node.right;
        }
        return res;
    }

    // Recursive Solution
    void recursiveInorder(List<Integer> res, TreeNode root) {
        if(root == null) return;
        recursiveInorder(res, root.left);
        res.add(root.val);
        recursiveInorder(res, root.right);
    }
}
