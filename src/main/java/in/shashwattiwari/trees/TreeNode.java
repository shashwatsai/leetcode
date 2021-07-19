package in.shashwattiwari.trees;

public class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;

    public TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "left=" + left +
                ", right=" + right +
                ", val=" + val +
                '}';
    }
}
