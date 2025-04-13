/*
653. Two Sum IV - Input is a BST

Given the root of a binary search tree and an integer k, return true if there exist two elements in the BST such that
their sum is equal to k, or false otherwise.

Example 1:
Input: root = [5,3,6,2,4,null,7], k = 9
Output: true

Example 2:
Input: root = [5,3,6,2,4,null,7], k = 28
Output: false


Constraints:
The number of nodes in the tree is in the range [1, 104].
-104 <= Node.val <= 104
root is guaranteed to be a valid binary search tree.
-105 <= k <= 105
 */

package binarySearchTree.medium;

import binaryTrees.TreeNode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

// Use BST iterator method
public class TwoSum {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> hashSet = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            int val = node.val;
            if(!hashSet.isEmpty() && hashSet.contains(val)) return true;
            hashSet.add(k-val);
            if(node.left!=null) queue.add(node.left);
            if(node.right!=null) queue.add(node.right);
        }
        return false;
    }
}
