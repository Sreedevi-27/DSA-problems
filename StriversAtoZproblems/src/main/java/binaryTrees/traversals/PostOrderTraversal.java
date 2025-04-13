/*
145. Binary Tree Postorder Traversal
Given the root of a binary tree, return the postorder traversal of its nodes' values.

Example 1:
Input: root = [1,null,2,3]
Output: [3,2,1]

Example 2:
Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
Output: [4,6,7,5,2,9,8,3,1]

Constraints:
The number of the nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
 */

package binaryTrees.traversals;

import binaryTrees.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversal {
    public List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        gePostOrderRecursion(root, list);
        return list;
    }

    public void gePostOrderRecursion(TreeNode root, List<Integer> list){
        if(root==null) return ;
        gePostOrderRecursion(root.left, list);
        gePostOrderRecursion(root.right, list);
        list.add(root.val);
    }

    public List<Integer> postorderTraversalUsingStack(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while(true){
            if(curr!=null){
                stack.push(curr);
                curr = curr.left;
            }else{
                if(stack.isEmpty()) break;
                TreeNode temp = stack.peek().right;
                if(temp==null){
                    temp = stack.pop();
                    result.add(temp.val);
                    while(!stack.isEmpty() && stack.peek().right==temp){
                        temp = stack.pop();
                        result.add(temp.val);
                    }
                }else{
                    curr = temp;
                }
            }
        }
        return result;
    }
}


