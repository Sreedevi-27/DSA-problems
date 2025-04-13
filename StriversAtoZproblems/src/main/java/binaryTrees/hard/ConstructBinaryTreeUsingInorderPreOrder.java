/*
105. Construct Binary Tree from Preorder and Inorder Traversal

Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is
the inorder traversal of the same tree, construct and return the binary tree.

Example 1:
Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
Output: [3,9,20,null,null,15,7]

Example 2:
Input: preorder = [-1], inorder = [-1]
Output: [-1]

Constraints:
1 <= preorder.length <= 3000
inorder.length == preorder.length
-3000 <= preorder[i], inorder[i] <= 3000
preorder and inorder consist of unique values.
Each value of inorder also appears in preorder.
preorder is guaranteed to be the preorder traversal of the tree.
inorder is guaranteed to be the inorder traversal of the tree.
 */

package binaryTrees.hard;

import binaryTrees.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeUsingInorderPreOrder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++) map.put(inorder[i], i);
        return build(preorder, inorder, 0, inorder.length-1, 0, preorder.length-1, map);
    }

    public TreeNode build(int[] preorder, int[] inorder, int inStart, int inEnd,
                          int preStart, int preEnd, Map<Integer,Integer> map){

        if(preStart>preEnd || inStart>inEnd) return null;
        TreeNode node = new TreeNode(preorder[preStart]);
        int inIndex = map.get(preorder[preStart]);
        int preIndex = inIndex - inStart;
        node.left = build(preorder, inorder, inStart, inIndex-1, preStart+1, preStart+preIndex, map);
        node.right = build(preorder, inorder, inIndex+1, inEnd, preStart+preIndex+1, preEnd,map);
        return node;
    }
}
