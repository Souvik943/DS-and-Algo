package patterns.Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//1. Define a returning DS and a level variable = 0
//2. Do a noral BFS
//3. Before entering the left and right child , we check the following :
//        1. If the level % 2 == 0 (even) , then we enter the values normally
//        2. Else , we use addFIrst() to reverse the order
//4. After exiting the inner loop , do a level++;
//5. Add the currentList to the res
//6. Return the res .

public class ZigZagLevelOrderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {

        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<size; i++) {
                TreeNode node = queue.poll();
                if(level % 2 == 0) {
                    list.add(node.val);
                } else {
                    list.addFirst(node.val);
                }
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
            level++;
            res.add(list);
        }
        return res;
    }
}
