/*
98. Validate Binary Search Tree

Given the root of a binary tree, determine if it is a valid binary search tree (BST).
A valid BST is defined as follows:
The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.

Example 1:
Input: root = [2,1,3]
Output: true

Example 2:
Input: root = [5,1,4,null,null,3,6]
Output: false
Explanation: The root node's value is 5 but its right child's value is 4.

Constraints:
The number of nodes in the tree is in the range [1, 104].
-231 <= Node.val <= 231 - 1
 */

package binarySearchTree.medium;

import binaryTrees.TreeNode;

public class CheckIfBST {
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        return findIfValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean findIfValid(TreeNode root, long min, long max){
        if(root==null) return true;
        if(root.val <= min || root.val >= max) return false;
        boolean left =  findIfValid(root.left, min, root.val);
        boolean right = findIfValid(root.right, root.val, max);
        return left && right;
    }
}
