/*
222. Count Complete Tree Nodes
Given the root of a complete binary tree, return the number of the nodes in the tree.
According to Wikipedia, every level, except possibly the last, is completely filled in a complete binary tree, and
all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.
Design an algorithm that runs in less than O(n) time complexity.

Example 1:
Input: root = [1,2,3,4,5,6]
Output: 6

Example 2:
Input: root = []
Output: 0

Example 3:
Input: root = [1]
Output: 1

Constraints:
The number of nodes in the tree is in the range [0, 5 * 104].
0 <= Node.val <= 5 * 104
The tree is guaranteed to be complete.
 */

package binaryTrees.hard;

import binaryTrees.TreeNode;

public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        int left = heightLeft(root.left);
        int right = heightRight(root.right);
        if(left==right) return  1 + (int)(Math.pow(2, left)-1) + (int)(Math.pow(2, right)-1);
        return 1+countNodes(root.left)+countNodes(root.right);
    }

    public int heightLeft(TreeNode root){
        int count=0;
        while(root!=null){
            count++;
            root = root.left;
        }
        return count;
    }

    public int heightRight(TreeNode root){
        int count=0;
        while(root!=null){
            count++;
            root = root.right;
        }
        return count;
    }
}
