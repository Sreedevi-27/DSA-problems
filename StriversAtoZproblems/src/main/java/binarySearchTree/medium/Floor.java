/*
Floor in BST

You are given a BST(Binary Search Tree) with n number of nodes and value x. your task is to find the greatest value
node of the BST which is smaller than or equal to x.
Note: when x is smaller than the smallest node of BST then returns -1.

Example 1:
Input:
n = 7               2
                     \
                      81
                    /     \
                 42       87
                   \       \
                    66      90
                   /
                 45
x = 87
Output: 87
Explanation: 87 is present in tree so floor will be 87.

Example 2:
Input:
n = 4                     6
                           \
                            8
                          /   \
                        7       9
x = 11
Output: 9

Example 3:
Input:
n = 4                     6
                           \
                            8
                          /   \
                        7       9
x = 5
Output: -1

Constraint:
1 <= Noda data <= 109
1 <= n <= 105
 */

package binarySearchTree.medium;

import binaryTrees.TreeNode;

public class Floor {
    public static int floor(TreeNode root, int key) {
        if (root == null) return -1;
        int ans = -1;
        while(root!=null){
            if(root.val == key) return root.val;
            if(root.val > key) root = root.left;
            else{
                ans = root.val;
                root = root.right;
            }
        }
        return ans;
    }
}
