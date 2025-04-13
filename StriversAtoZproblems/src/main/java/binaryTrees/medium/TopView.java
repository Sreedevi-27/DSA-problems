/*
Top View of Binary Tree

You are given a binary tree, and your task is to return its top view. The top view of a binary tree is the set of nodes
visible when the tree is viewed from the top.

Note:
Return the nodes from the leftmost node to the rightmost node.
If two nodes are at the same position (horizontal distance) and are outside the shadow of the tree, consider the
leftmost node only.

Example 1:
Input: root[] = [1, 2, 3]
Output: [2, 1, 3]

Example 2:
Input: root[] = [10, 20, 30, 40, 60, 90, 100]
Output: [40, 20, 10, 30, 100]
Explanation: The root 10 is visible.
On the left, 40 is the leftmost node and visible, followed by 20.
On the right, 30 and 100 are visible. Thus, the top view is 40 20 10 30 100.

Example 3:
Input: root[] = [1, 2, 3, N, 4, N, N, N, 5, N, 6]
       1
     /   \
    2     3
     \
      4
       \
        5
         \
          6
Output: [2, 1, 3, 6]
Explanation: Node 1 is the root and visible.
Node 2 is the left child and visible from the left side.
Node 3 is the right child and visible from the right side.
Nodes 4, 5, and 6 are vertically aligned, but only the lowest node 6 is visible from the top view. Thus, the top view is 2 1 3 6.

Constraints:
1 ≤ number of nodes ≤ 105
1 ≤ node->data ≤ 105
 */

package binaryTrees.medium;

import binaryTrees.TreeNode;

import java.util.*;

public class TopView {
    public List<Integer> topView(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if(root==null) return result;

        Queue<Pair> queue = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        queue.add(new Pair(root, 0));
        while(!queue.isEmpty()){
            Pair p = queue.poll();
            TreeNode node = p.node;
            int y = p.y;
            if(!map.containsKey(y)) map.put(y, node.val);
            if(node.left!=null)
                queue.add(new Pair(node.left, y-1));
            if(node.right!=null)
                queue.add(new Pair(node.right, y+1));
        }

        for (int value : map.values()) {
            result.add(value);
        }
        return result;
    }

    class Pair{
        TreeNode node;
        int y;
        Pair(TreeNode node, int y){
            this.node = node;
            this.y = y;
        }
    }
}
