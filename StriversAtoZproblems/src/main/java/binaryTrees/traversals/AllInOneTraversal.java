/*
You have been given a Binary Tree of 'N' nodes, where the nodes have integer values.
Your task is to return the ln-Order, Pre-Order, and Post-Order traversals of the given binary tree

For example :
Sample Input 1 :
1 2 3 -1 -1 -1  6 -1 -1
Sample Output 1 :
Inorder traversal of given tree = [2, 1, 3, 6]
Preorder traversal of given tree = [1, 2, 3, 6]
Postorder traversal of given tree = [2, 6, 3, 1]

Constraints :
1 <= 'N' <= 10^5
0 <= 'data' <= 10^5
where 'N' is the number of nodes and 'data' denotes the node value of the binary tree nodes.

Time limit: 1 sec
 */

package binaryTrees.traversals;

import binaryTrees.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AllInOneTraversal {
    public List<List<Integer>> getTreeTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> inorder = new ArrayList<>();
        List<Integer> preorder = new ArrayList<>();
        List<Integer> postorder = new ArrayList<>();
        Stack<Pair> stack = new Stack<>();
        if(root!=null) stack.add(new Pair(root, 1));
        while(!stack.isEmpty()){
            Pair p = stack.pop();
            TreeNode node = p.node;
            int count = p.count;

            // inorder
            if(count==1){
                preorder.add(node.val);
                Pair newPair = new Pair(node, count+1);
                stack.push(newPair);
                if(node.left!=null) stack.push(new Pair(node.left, 1));
            }
            // preorder
            else if(count==2){
                inorder.add(node.val);
                Pair newPair = new Pair(node, count+1);
                stack.push(newPair);
                if(node.right!=null) stack.push(new Pair(node.right, 1));
            }else{
                postorder.add(node.val);
            }
        }

        result.add(inorder);
        result.add(preorder);
        result.add(postorder);
        return result;
    }

    class Pair{
        TreeNode node;
        int count;
        Pair(TreeNode node, int count){
            this.node = node;
            this.count = count;
        }
    }
}