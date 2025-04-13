/*
Inorder successor and predecessor in BST

Given the root node of a binary search tree (BST) and an integer key. Return the Inorder predecessor and successor of
the given key from the provided BST. If predecessor or successor is missing then return -1.

Example 1:
Input : root = [5, 2, 10, 1, 4, 7, 12] , key = 10
Output : [7, 12]

Example 2:
Input : root = [5, 2, 10, 1, 4, 7, 12] , key = 12
Output : [10, -1]

Example 3:
Input : root = [5, 2, 10, 1, 4, 7, 12] , key = 1
Output:
[-1, 2]
[1, 2]
[4, 7]
[2, -1]

Constraints:
1 <= Number of Nodes <= 104
1 <= Node.val <= 105
All the values Node.val are unique.
 */

package binarySearchTree.medium;

import binaryTrees.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class InorderSuccessorPredecessor {
    List<Integer> succPredBST(TreeNode root, int key) {
        List<Integer> list = new ArrayList<>();
        int pre = findPre(root, key);
        list.add(pre);
        int suc = findSuc(root, key);
        list.add(suc);
        return list;
    }

    public int findSuc(TreeNode root, int key){
        int suc = Integer.MAX_VALUE;
        while(root!=null){
            if(root.val <= key){
                root = root.right;
            }
            else{
                suc = root.val;
                root = root.left;
            }
        }
        return (suc==Integer.MAX_VALUE) ? -1 : suc;
    }

    public int findPre(TreeNode root, int key){
        int pre = Integer.MIN_VALUE;
        while(root!=null){
            if(root.val < key){
                pre = root.val;
                root = root.right;
            }
            else{
                root = root.left;
            }
        }
        return (pre==Integer.MIN_VALUE) ? -1 : pre;
    }
}
