public class Subtree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static int height(Node root) {
        if(root == null) {
            return 0 ;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;

    }

    public static int count(Node root) {
        if(root == null) {
            return 0 ;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;

    }


    public static int Sum(Node root) {
        if(root == null) {
            return 0 ;
        }
        int leftSum = Sum(root.left);
        int rightSum = Sum(root.right);
        return leftSum + rightSum + root.data;

    }


    public static int diameter2(Node root) { // O(n^2)
        if(root == null) {
            return 0;
        }
        int ldiam = diameter2(root.left);
        int rdiam = diameter2(root.right);
        int lh = height(root.left);
        int rh = height(root.right);
        int selfdiam = lh + rh + 1;
        return Math.max(selfdiam, Math.max(ldiam, rdiam));
    }

    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) { // constructor
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter(Node root) {  // O(n)
        if(root == null) {
            return new Info(0,0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);
        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht ) +1;
        return new Info(diam, ht);
    }




    public static boolean isIdentical(Node node , Node subRoot) {
        if(node ==  null && subRoot == null) {
            return true;
        } else if( node == null || subRoot == null || node.data!=subRoot.data) {
            return false;
        } 

        if(!isIdentical(node.left, subRoot.left)) {
            return false;
        }
        if(!isIdentical(node.right, subRoot.right)) {
            return false;
        }
        return true;     
        
    }
    public static boolean isSubtree(Node root, Node subRoot) {
        if(root == null) {
            return false;
        }
        if(root.data == subRoot.data) {
            if(isIdentical(root, subRoot)) {
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    } 
    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        boolean result = isSubtree(root, subRoot);
        System.out.println(result);
       
       
       
}
}