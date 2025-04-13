/*
863. All Nodes Distance K in Binary Tree

Given the root of a binary tree, the value of a target node target, and an integer k, return an array of the values of
all nodes that have a distance k from the target node.
You can return the answer in any order.

Example 1:
Input: root = [3,5,1,6,2,0,8,null,null,7,4], target = 5, k = 2
Output: [7,4,1]
Explanation: The nodes that are a distance 2 from the target node (with value 5) have values 7, 4, and 1.

Example 2:
Input: root = [1], target = 1, k = 3
Output: []

Constraints:
The number of nodes in the tree is in the range [1, 500].
0 <= Node.val <= 500
All the values Node.val are unique.
target is the value of one of the nodes in the tree.
0 <= k <= 1000
 */

package binaryTrees.hard;

import binaryTrees.TreeNode;

import java.util.*;

public class AllNodesAtKdistance {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Queue<TreeNode> queue = new LinkedList<>();
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                TreeNode curr = queue.poll();
                if(curr.left!=null){
                    queue.add(curr.left);
                    parent.put(curr.left, curr);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                    parent.put(curr.right, curr);
                }
            }
        }

        HashSet<TreeNode> visited = new HashSet<>();
        Queue<TreeNode> traverseQueue = new LinkedList<>();
        traverseQueue.add(target);
        visited.add(target);

        int count=0;
        while(!traverseQueue.isEmpty()){
            int size = traverseQueue.size();
            if(count==k) break;
            count++;
            for(int i=0; i<size; i++){
                TreeNode curr = traverseQueue.poll();
                if(curr.left!=null && !visited.contains(curr.left)){
                    visited.add(curr.left);
                    traverseQueue.add(curr.left);
                }
                if(curr.right!=null && !visited.contains(curr.right)){
                    visited.add(curr.right);
                    traverseQueue.add(curr.right);
                }
                TreeNode parentNode = parent.get(curr);
                if(parentNode!=null && !visited.contains(parentNode)){
                    visited.add(parentNode);
                    traverseQueue.add(parentNode);
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        while(!traverseQueue.isEmpty()){
            result.add(traverseQueue.poll().val);
        }
        return result;
    }
}
