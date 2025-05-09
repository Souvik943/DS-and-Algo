package patterns.Trees;

//1. First check if the root or root's left or root's right is null , If yes , return root
//2. First assign the root's left's = root's right
//        3. Now we see the root's next (i.e the node present on its rightside) is null or not .
//        4. If not , then root's right's next = root's next's left
//5. Then we call it through recursion with root.left
//6. Then call root.right
//7. Return root

public class PopulatingNextRightNode {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public Node connect(Node root) {
        if(root == null || root.left == null || root.right == null) {
            return root;
        }
        root.left.next = root.right;
        if(root.next != null) {
            root.right.next = root.next.left;
        }
        connect(root.left);
        connect(root.right);
        return root;
    }
}
