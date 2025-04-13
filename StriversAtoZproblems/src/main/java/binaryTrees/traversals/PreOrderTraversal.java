/*
144. Binary Tree Preorder Traversal
Given the root of a binary tree, return the preorder traversal of its nodes' values.

Example 1:
Input: root = [1,null,2,3]
Output: [1,2,3]

Example 2:
Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
Output: [1,2,4,5,6,7,3,8,9]

Constraints:
The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
 */

package binaryTrees.traversals;

import binaryTrees.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {
    public List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        getPreOrderRecursion(root, list);
        return list;
    }

    public void getPreOrderRecursion(TreeNode root, List<Integer> list){
        if(root==null) return ;
        list.add(root.val);
        getPreOrderRecursion(root.left, list);
        getPreOrderRecursion(root.right, list);
    }

    public List<Integer> preOrderTraversalUsingStack(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root==null) return result;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            result.add(node.val);
            if(node.right!=null) stack.push(node.right);
            if(node.left!=null) stack.push(node.left);
        }
        return result;
    }
}


