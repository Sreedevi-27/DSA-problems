/*
Children Sum in a Binary Tree

Given a binary tree having n nodes. Check whether all of its nodes have a value equal to the sum of their child nodes.
Return 1 if all the nodes in the tree satisfy the given properties, else it returns 0. For every node, the data value
must be equal to the sum of the data values in the left and right children. Consider the data value 0 for a NULL child.
Also, leaves are considered to follow the property.

Example 1:
Input:
Binary tree
       35
      /  \
     20   15
    / \   / \
   15  5 10  5
Output: 1
Explanation:
Here, every node is sum of its left and right child.

Example 2:
Input:
Binary tree
       1
     /   \
    4     3
   /
  5
Output: 0
Explanation:
Here, 1 is the root node and 4, 3 are its child nodes. 4 + 3 = 7 which is not equal to the value of root node. Hence, this tree does not satisfy the given condition.

Example 3:
Input:
Binary tree
       10
      /  \
     4    6
    / \  / \
   1   3 2  4

Output: 1
Explanation:
Here, every node is a sum of its left and right child.

Constraints:
1 <= number of nodes <= 105
0 <= node->data <= 105
 */

package binaryTrees.hard;

import binaryTrees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class ChildrenSum {
    public static int isSumProperty(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return 0;

        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                if (curr.left == null && curr.right == null) continue;

                int sum = curr.val;
                int left = 0;
                if (curr.left != null) {
                    queue.add(curr.left);
                    left = curr.left.val;
                }
                int right = 0;
                if (curr.right != null) {
                    queue.add(curr.right);
                    right = curr.right.val;
                }
                if (sum != left + right) return 0;
            }
        }
        return 1;
    }
}
