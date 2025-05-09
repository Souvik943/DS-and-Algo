package patterns.Trees;

import java.util.LinkedList;
import java.util.Queue;
//Create 3 variables : maxSum , currLevel , maxLevel
//Perform a BFS
//Before the second loop , initialise a sum variable to calculate and reset its value at every level
//After completing the inner loop , check if sum > maxSum , then update the maxSum and maxLevel = currLevel
//Do a currLevel++;
//Return maxLeel
public class MaxLevelSumOfBinaryTree {
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

    public int maxLevelSum(TreeNode root) {
        if(root == null) return 0;
        int leveWithMaxSum = 0;
        int currentLevel = 0;
        int maxSum = Integer.MIN_VALUE;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            int sum = 0;
            for(int i=0; i<size; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if(node.left != null) {
                    queue.offer(node.left);
                }
                if(node.right != null) {
                    queue.offer(node.right);
                }
            }
            if(sum > maxSum) {
                maxSum = sum;
                leveWithMaxSum = currentLevel;
            }
            currentLevel++;
        }
        return leveWithMaxSum;
    }
}
