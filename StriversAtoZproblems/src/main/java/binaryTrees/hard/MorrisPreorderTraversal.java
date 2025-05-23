/*
144. Binary Tree Preorder Traversal

Given the root of a binary tree, return the preorder traversal of its nodes' values.

Example 1:
Input: root = [1,null,2,3]
Output: [1,2,3]

Example 2:
Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
Output: [1,2,4,5,6,7,3,8,9]

Example 3:
Input: root = []
Output: []

Example 4:
Input: root = [1]
Output: [1]

Constraints:
The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
 */

package binaryTrees.hard;

import binaryTrees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class MorrisPreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        TreeNode curr = root;
        while(curr!=null){
            if(curr.left==null){
                result.add(curr.val);
                curr = curr.right;
            } else{
                TreeNode prev = curr.left;
                while(prev.right!=null && prev.right!=curr) prev = prev.right;
                if(prev.right==null){
                    prev.right = curr;
                    result.add(curr.val);
                    curr = curr.left;
                }else{
                    prev.right = null;
                    curr = curr.right;
                }
            }
        }
        return result;
    }
}
