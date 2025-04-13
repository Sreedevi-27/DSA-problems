/*
106. Construct Binary Tree from Inorder and Postorder Traversal

Given two integer arrays inorder and postorder where inorder is the inorder traversal of a binary tree and postorder
is the postorder traversal of the same tree, construct and return the binary tree.

Example 1:
Input: inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
Output: [3,9,20,null,null,15,7]

Example 2:
Input: inorder = [-1], postorder = [-1]
Output: [-1]

Constraints:
1 <= inorder.length <= 3000
postorder.length == inorder.length
-3000 <= inorder[i], postorder[i] <= 3000
inorder and postorder consist of unique values.
Each value of postorder also appears in inorder.
inorder is guaranteed to be the inorder traversal of the tree.
postorder is guaranteed to be the postorder traversal of the tree.
 */

package binaryTrees.hard;

import binaryTrees.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeUsingInorderPostOrder {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++) map.put(inorder[i], i);
        return build(inorder, postorder, 0, inorder.length-1, 0, postorder.length-1, map);
    }

    public TreeNode build(int[] inorder, int[] postorder, int inStart, int inEnd, int postStart, int postEnd, Map<Integer, Integer> map){
        if(inStart>inEnd || postStart>postEnd) return null;
        TreeNode node = new TreeNode(postorder[postEnd]);
        int inIndex = map.get(postorder[postEnd]);
        int postIndex = inIndex-inStart;
        node.left = build(inorder, postorder, inStart, inIndex-1, postStart, postStart+postIndex-1, map);
        node.right = build(inorder, postorder, inIndex+1, inEnd, postStart+postIndex, postEnd-1, map);
        return node;
    }
}
