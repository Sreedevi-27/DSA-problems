/*
103. Binary Tree Zigzag Level Order Traversal

Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right,
 then right to left for the next level and alternate between).

Example 1:
Input: root = [3,9,20,null,null,15,7]
Output: [[3],[20,9],[15,7]]

Example 2:
Input: root = [1]
Output: [[1]]

Example 3:
Input: root = []
Output: []

Constraints:
The number of nodes in the tree is in the range [0, 2000].
-100 <= Node.val <= 100
 */

package binaryTrees.medium;

import binaryTrees.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class ZigZagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;

        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        boolean isQueue = true;

        while(!deque.isEmpty()){
            int size = deque.size();
            List<Integer> temp = new ArrayList<>();
            if(isQueue){
                for(int i=0; i<size; i++){
                    TreeNode node = deque.removeFirst();
                    temp.add(node.val);
                    if(node.left!=null) deque.addLast(node.left);
                    if(node.right!=null) deque.addLast(node.right);
                }
                isQueue = false;
            }else{
                for(int i=0; i<size; i++){
                    TreeNode node = deque.removeLast();
                    temp.add(node.val);
                    if(node.right!=null) deque.addFirst(node.right);
                    if(node.left!=null) deque.addFirst(node.left);
                }
                isQueue = true;
            }
            result.add(temp);
        }
        return result;
    }
}
