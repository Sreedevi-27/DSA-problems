/*
1008. Construct Binary Search Tree from Preorder Traversal

Given an array of integers preorder, which represents the preorder traversal of a BST (i.e., binary search tree),
construct the tree and return its root. It is guaranteed that there is always possible to find a binary search tree
with the given requirements for the given test cases.
A binary search tree is a binary tree where for every node, any descendant of Node.left has a value strictly less than
Node.val, and any descendant of Node.right has a value strictly greater than Node.val.
A preorder traversal of a binary tree displays the value of the node first, then traverses Node.left, then traverses
Node.right.

Example 1:
Input: preorder = [8,5,1,7,10,12]
Output: [8,5,10,1,7,null,12]

Example 2:
Input: preorder = [1,3]
Output: [1,null,3]
 */

package binarySearchTree.medium;

import binaryTrees.TreeNode;

public class ConstructBSTfromPreorderTraversal {
    public TreeNode bstFromPreorder(int[] preorder) {
        return formBST(preorder,  new int[]{0}, Integer.MAX_VALUE);
    }

    public TreeNode formBST(int[] preorder, int[] index, int bound){
        if(index[0] >= preorder.length || preorder[index[0]] > bound) return null;
        TreeNode node = new TreeNode(preorder[index[0]++]);
        node.left = formBST(preorder, index, node.val);
        node.right = formBST(preorder, index, bound);
        return node;
    }
}
