/*
Ceil in BST

Given a BST and a number X, find Ceil of X.
Note: Ceil(X) is a number that is either equal to X or is immediately greater than X.
If Ceil could not be found, return -1.

Example 1:
Input: root = [5, 1, 7, N, 2, N, N, N, 3], X = 3
      5
    /   \
   1     7
    \
     2
      \
       3
Output: 3
Explanation: We find 3 in BST, so ceil of 3 is 3.

Example 2:
Input: root = [10, 5, 11, 4, 7, N, N, N, N, N, 8], X = 6
     10
    /  \
   5    11
  / \
 4   7
      \
       8
Output: 7
Explanation: We find 7 in BST, so ceil of 6 is 7.

Your task:
You don't need to read input or print anything. Just complete the function findCeil() to implement ceil in BST which
returns the ceil of X in the given BST.

Constraints:
1 <= Number of nodes <= 105
1 <= Value of nodes<= 105
 */

package binarySearchTree.medium;

import binaryTrees.TreeNode;

public class Ceil {
    int findCeil(TreeNode root, int key) {
        if (root == null) return -1;
        int ans = -1;
        while(root!=null){
            if(root.val == key) return root.val;
            if(root.val > key){
                ans = root.val;
                root = root.left;
            }
            else root = root.right;
        }
        return ans;
    }
}
