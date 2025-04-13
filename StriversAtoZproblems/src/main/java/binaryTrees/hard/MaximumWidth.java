/*
662. Maximum Width of Binary Tree

The maximum width of a tree is the maximum width among all levels.
The width of one level is defined as the length between the end-nodes (the leftmost and rightmost non-null nodes),
where the null nodes between the end-nodes that would be present in a complete binary tree extending down to that
level are also counted into the length calculation.
It is guaranteed that the answer will in the range of a 32-bit signed integer.

Example 1:
Input: root = [1,3,2,5,3,null,9]
Output: 4
Explanation: The maximum width exists in the third level with length 4 (5,3,null,9).

Example 2:
Input: root = [1,3,2,5,null,null,9,6,null,7]
Output: 7
Explanation: The maximum width exists in the fourth level with length 7 (6,null,null,null,null,null,7).

Example 3:
Input: root = [1,3,2,5]
Output: 2
Explanation: The maximum width exists in the second level with length 2 (3,2).

Constraints:
The number of nodes in the tree is in the range [1, 3000].
-100 <= Node.val <= 100
 */

package binaryTrees.hard;

import binaryTrees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidth {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> queue = new LinkedList<>();
        if (root == null) return 0;
        queue.add(new Pair(root, 1));

        int max = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            int first = 0, last = 0;
            for (int i = 0; i < size; i++) {
                Pair p = queue.poll();
                TreeNode node = p.node;
                int index = p.index - 1;
                if (i == 0) first = index;
                if (i == size - 1) last = index;
                if (node.left != null) queue.add(new Pair(node.left, (2 * index) + 1));
                if (node.right != null) queue.add(new Pair(node.right, (2 * index) + 2));
            }
            max = Math.max(max, last - first + 1);
        }
        return max;
    }

    class Pair {
        TreeNode node;
        int index;

        Pair(TreeNode node, int index) {
            this.node = node;
            this.index = index;
        }
    }
}
