/*
Root to Leaf Paths

Given a Binary Tree, you need to find all the possible paths from the root node to all the leaf nodes of the binary tree.
Note: The paths should be returned such that paths from the left subtree of any node are listed first, followed by
paths from the right subtree.

Example 1:
Input: root[] = [1, 2, 3, 4, 5]
Output: [[1, 2, 4], [1, 2, 5], [1, 3]]
Explanation: All possible paths: 1->2->4, 1->2->5 and 1->3

Example 2:
Input: root[] = [1, 2, 3]
       1
    /     \
   2       3
Output: [[1, 2], [1, 3]]
Explanation: All possible paths: 1->2 and 1->3

Example 3:
Input: root[] = [10, 20, 30, 40, 60]
         10
       /    \
      20    30
     /  \
    40   60
Output: [[10, 20, 40], [10, 20, 60], [10, 30]]
Explanation: All possible paths: 10->20 ->40, 10->20->60 and 10->30

Constraints:
1<=number of nodes<=104
1<=node->data<=104
 */

package binaryTrees.hard;

import binaryTrees.TreeNode;

import java.util.ArrayList;

public class RootToLeafPath {
    public static ArrayList<ArrayList<Integer>> Paths(TreeNode root) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        ArrayList<Integer> list = new ArrayList<>();
        traversal(root, list, result);
        return result;
    }

    public static void traversal(TreeNode root, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> result) {
        if (root == null) return;
        if (isLeafNode(root)) {
            list.add(root.val);
            result.add(new ArrayList<>(list));
            return;
        }
        list.add(root.val);
        traversal(root.left, new ArrayList<>(list), result);
        traversal(root.right, new ArrayList<>(list), result);
    }

    public static boolean isLeafNode(TreeNode node) {
        if (node.left == null && node.right == null) return true;
        return false;
    }
}
