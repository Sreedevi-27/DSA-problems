/*
Largest BST

You're given a binary tree. Your task is to find the size of the largest subtree within this binary tree that also satisfies
 the properties of a Binary Search Tree (BST). The size of a subtree is defined as the number of nodes it contains.

Note: A subtree of the binary tree is considered a BST if for every node in that subtree, the left child is less than
the node, and the right child is greater than the node, without any duplicate values in the subtree.

Example 1:
Input: root = [5, 2, 4, 1, 3]
Root-to-leaf-path-sum-equal-to-a-given-number-copy
Output: 3
Explanation:The following sub-tree is a BST of size 3

Example 1:
Input: root = [6, 7, 3, N, 2, 2, 4]
Output: 3
Explanation: The following sub-tree is a BST of size 3:

Constraints:
1 ≤ number of nodes ≤ 105
1 ≤ node->data ≤ 105
 */

package binarySearchTree.medium;

import binaryTrees.TreeNode;

public class LargestBST {
    static int largestBst(TreeNode root) {
        return findLargestBST(root).maxSize;
    }

    public static NodeValue findLargestBST(TreeNode root) {
        if (root == null) {
            return new NodeValue(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }

        NodeValue left = findLargestBST(root.left);
        NodeValue right = findLargestBST(root.right);

        if (left.max < root.val && root.val < right.min) {
            return new NodeValue(Math.min(root.val, left.min), Math.max(root.val, right.max),
                    left.maxSize + right.maxSize + 1);
        }

        return new NodeValue(Integer.MIN_VALUE, Integer.MAX_VALUE,
                Math.max(left.maxSize, right.maxSize));

    }

    static class NodeValue {
        int min;
        int max;
        int maxSize;

        NodeValue(int min, int max, int maxSize) {
            this.min = min;
            this.max = max;
            this.maxSize = maxSize;
        }
    }
}
