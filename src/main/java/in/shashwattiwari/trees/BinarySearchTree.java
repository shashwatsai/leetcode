package in.shashwattiwari.trees;

import java.util.List;

public class BinarySearchTree {

    public TreeNode insert(TreeNode root, int val){
        if(root == null){
            return new TreeNode(val);
        }

        if(root.val < val){
            root.right = insert(root.right, val);
        }else if(root.val >= val){
            root.left = insert(root.left, val);
        }

        return root;
    }

    public TreeNode delete(TreeNode root, int val){
        if(root == null){
            return root;
        }

        if(root.val < val){
            root.right = delete(root.right, val);
        }else if(root.val > val){
            root.left = delete(root.left, val);
        }else{
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }else{
                root.val = findMin(root.right);
                root.right = delete(root.right, root.val);
            }
        }

        return root;
    }

    public int findMin(TreeNode root){
        int minV = root.val;
        while(root.left != null){
            minV = root.val;
            root =root.left;
        }

        return minV;
    }

    public void getInOrder(TreeNode root, List<Integer> inOrderList){
        if(root != null){
            getInOrder(root.left, inOrderList);
            inOrderList.add(root.val);
            getInOrder(root.right, inOrderList);
        }
    }
}
