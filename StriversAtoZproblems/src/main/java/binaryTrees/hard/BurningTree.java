/*
Burning Tree

Given a binary tree and a node data called target. Find the minimum time required to burn the complete binary tree
if the target is set on fire. It is known that in 1 second all nodes connected to a given node get burned.
That is its left child, right child, and parent.
Note: The tree contains unique values.

Example 1:
Input: root[] = [1,2,3,4,5,N,6,N,N,7,8,N,9,N,N,N,N,N,10],  target = 8
Output: 7
Explanation: If leaf with the value 8 is set on fire.
After 1 sec: 5 catches fire.
After 2 sec: 2, 7 catches fire.
After 3 sec: 4, 1 catches fire.
After 4 sec: 3 catches fire.
After 5 sec: 6 catches fire.
After 6 sec: 9 catches fire.
After 7 sec: 10 catches fire.
It takes 7s to burn the complete tree.

Example 2:
Input: root[] = [1, 2, 3, 4, 5, N, 7, 8, N, 10], target = 10
Output: 5
Explanation: If leaf with the value 10 is set on fire.
- After 1 sec: Node 5 catches fire.
- After 2 sec: Node 2 catches fire.
- After 3 sec: Nodes 1 and 4 catches fire.
- After 4 sec: Node 3 and 8 catches fire.
- After 5 sec: Node 7 catches fire.
It takes 5s to burn the complete tree.

Constraints:
1 ≤ number of nodes ≤ 105
1 ≤ node->data ≤ 105
 */

package binaryTrees.hard;

import binaryTrees.TreeNode;

import java.util.*;

public class BurningTree {
    public static int minTime(TreeNode root, int target) {

        Map<TreeNode, TreeNode> parentMap = new HashMap<>();
        TreeNode targetNode = getParentMap(parentMap, root, target);

        Queue<TreeNode> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        queue.add(targetNode);
        visited.add(target);

        int count=0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                TreeNode curr = queue.poll();
                if(curr.left!=null && !visited.contains(curr.left.val)){
                    queue.add(curr.left);
                    visited.add(curr.left.val);
                }
                if(curr.right!=null && !visited.contains(curr.right.val)){
                    queue.add(curr.right);
                    visited.add(curr.right.val);
                }
                TreeNode parentNode = parentMap.get(curr);
                if(parentNode!=null && !visited.contains(parentNode.val)){
                    queue.add(parentNode);
                    visited.add(parentNode.val);
                }
            }
            count++;
        }
        return count-1;
    }

    public static TreeNode getParentMap(Map<TreeNode, TreeNode> parentMap, TreeNode root, int targetVal){
        TreeNode targetNode = new TreeNode(-1);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                TreeNode curr = queue.poll();
                if(curr.val == targetVal) targetNode = curr;
                if(curr.left!=null){
                    queue.add(curr.left);
                    parentMap.put(curr.left, curr);
                }
                if(curr.right!=null){
                    queue.add(curr.right);
                    parentMap.put(curr.right, curr);
                }
            }
        }
        return targetNode;
    }
}
