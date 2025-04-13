/*
Minimum element in BST

Given the root of a Binary Search Tree. The task is to find the minimum valued element in this given BST.

Example 1:
Input: root = [5, 4, 6, 3, N, N, 7, 1]
Output: 1

Example 2:
Input: root = [10, 5, 20, 2]
Output: 2

Example 3:
Input: root = [10, N, 10, N, 11]
             10
              \
               10
                \
                 11
Output: 10

Constraints:
0 <= number of nodes <= 105
0 <= node->data <= 105
 */

package binarySearchTree.introduction;

import binaryTrees.TreeNode;

public class MinValueInBST {
    int minValue(TreeNode root) {
        if(root==null) return 0;
        while(root.left!=null){
            root = root.left;
        }
        return root.val;
    }
}
