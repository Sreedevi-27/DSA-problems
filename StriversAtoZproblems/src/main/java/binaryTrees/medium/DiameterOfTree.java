/*
543. Diameter of Binary Tree

Given the root of a binary tree, return the length of the diameter of the tree.
The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or
may not pass through the root.
The length of a path between two nodes is represented by the number of edges between them.

Example 1:
Input: root = [1,2,3,4,5]
Output: 3
Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].

Example 2:
Input: root = [1,2]
Output: 1

Constraints:
The number of nodes in the tree is in the range [1, 104].
-100 <= Node.val <= 100
 */

package binaryTrees.medium;

import binaryTrees.TreeNode;

public class DiameterOfTree {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] max = new int[1];
        max[0] = Integer.MIN_VALUE;
        findHeight(root, max);
        return max[0];
    }

    public int findHeight(TreeNode root, int[] max){
        if(root==null) return 0;
        int left = findHeight(root.left, max);
        int right = findHeight(root.right, max);
        max[0] = Math.max(max[0], left+right);
        return Math.max(left, right)+1;
    }
}
