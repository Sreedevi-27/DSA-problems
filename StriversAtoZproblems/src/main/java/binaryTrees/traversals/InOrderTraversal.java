/*
94. Binary Tree Inorder Traversal
Given the root of a binary tree, return the inorder traversal of its nodes' values.

Example 1:
Input: root = [1,null,2,3]
Output: [1,3,2]

Example 2:
Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
Output: [4,2,6,5,7,1,3,9,8]

Constraints:
The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
 */

package binaryTrees.traversals;

import binaryTrees.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {
    public List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        getInOrderRecursion(root, list);
        return list;
    }

    public void getInOrderRecursion(TreeNode root, List<Integer> list){
        if(root==null) return ;
        getInOrderRecursion(root.left, list);
        list.add(root.val);
        getInOrderRecursion(root.right, list);
    }

    public List<Integer> inOrderTraversalUsingStack(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root==null) return result;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;

        while(true){
            if(node!=null){
                stack.push(node);
                node = node.left;
            }
            else{
                if(stack.isEmpty()) break;
                node = stack.pop();
                result.add(node.val);
                node = node.right;
            }
        }
        return result;
    }


}

