package in.shashwattiwari.arrays;

import in.shashwattiwari.trees.BinarySearchTree;
import in.shashwattiwari.trees.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 *  <b>Problem Statement</b>: Given number in non decreasing order, including both positives and or negative
 *  find the squares of number in non decreasing order, in linear complexity.
 */
public class SquaresOfElements {

    /**
     * <b>Approach</b>: Construct a BST, insert squares of each element. The squares will get inserted
     * in non decreasing order. Return an inorder traversal of constructed BST.
     *
     * <pre>
     * Complexity:
     *  Time Complexity: constructing a BST is O(n), getting an inorder traversal is O(n), two pass algorithm
     *  Space Complexity: O(n) for storing tree and inOrder list.
     * </pre>
     * @param nums array of ints in non decreasing order
     * @return array of int, each element is a square in non decreasing order
     */
    public Integer [] squares(int [] nums){
        if(nums == null || nums.length == 0){
            return new Integer[]{};
        }

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        TreeNode root = null;
        for(int num : nums){
            root = binarySearchTree.insert(root, num*num);
        }

        List<Integer> inOrderList = new ArrayList<>();
        binarySearchTree.getInOrder(root, inOrderList);

        return inOrderList.stream().toArray(Integer[]::new);
    }

    /**
     * Approach: given number in non decreasing order, using this characteristic, we can traverse from
     * the left and right, and keep shrinking the window by getting the current absolute max before num[left] and num[right]
     *
     * Complexity:
     *  Time Complexity: O(n) one pass
     *  Space Complexity: O(n) storing the squares
     *
     * Follow Up:
     *  Can we make it inplace?
     * @param nums array of ints in non decreasing order
     * @return array of int, each element is a square in non decreasing order
     */
    public int [] squaresPrimitive(int [] nums){
        if(nums == null || nums.length == 0){
            return new int[]{};
        }

        int iLen = nums.length;
        int [] res = new int[iLen];
        int square;
        int left = 0;
        int right = iLen-1;
        for(int i = iLen-1; i >= 0; i--){
            if(Math.abs(nums[right]) < Math.abs(nums[left])){
                square = nums[left]*nums[left];
                left++;
            }else{
                square = nums[right]*nums[right];
                right--;
            }

            res[i] = square;
        }

        return res;
    }
}
