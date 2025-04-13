/*
Bottom View of Binary Tree

Given a binary tree, return an array where elements represent the bottom view of the binary tree from left to right.
Note: If there are multiple bottom-most nodes for a horizontal distance from the root, then the latter one in the level
traversal is considered. For example, in the below diagram, 3 and 4 are both the bottommost nodes at a horizontal
distance of 0, here 4 will be considered.

                      20
                    /    \
                  8       22
                /   \     /   \
              5      3 4     25
                     /    \
                 10       14
For the above tree, the output should be 5 10 4 14 25.


Example 1 :
Input:
       1
     /   \
    3     2
Output: 3 1 2
Explanation: First case represents a tree with 3 nodes and 2 edges where root is 1, left child of 1 is 3 and
right child of 1 is 2.
Thus bottom view of the binary tree will be 3 1 2.

Example 2 :
Input:
         10
       /    \
      20    30
     /  \
    40   60
Output: 40 20 60 30

Example 3 :
Input:
        1
       /
      2
Output: 2 1


Constraints:
1 <= number of nodes <= 105
1 <= node->data <= 105
 */

package binaryTrees.medium;

import binaryTrees.TreeNode;

import java.util.*;

public class BottomView {
    public ArrayList<Integer> bottomView(TreeNode root){
        ArrayList<Integer> result = new ArrayList<>();
        if(root==null) return result;

        Queue<Pair> queue = new LinkedList<>();
        Map<Integer,Integer> map = new TreeMap<>();
        queue.add(new Pair(root, 0));

        while(!queue.isEmpty()){
            Pair p = queue.poll();
            TreeNode node = p.node;
            int index = p.index;
            map.put(index, node.val);
            if(node.left!=null) queue.add(new Pair(node.left, index-1));
            if(node.right!=null) queue.add(new Pair(node.right, index+1));
        }

        for(int value : map.values()){
            result.add(value);
        }
        return result;
    }

    class Pair{
        TreeNode node;
        int index;
        Pair(TreeNode node, int index){
            this.node = node;
            this.index = index;
        }
    }
}
