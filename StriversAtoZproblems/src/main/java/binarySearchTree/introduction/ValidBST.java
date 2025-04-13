/*
Binary Search Trees

Given an array of integers arr[] representing inorder traversal of elements of a binary tree.
Return true if the given inorder traversal can be of a valid Binary Search Tree.
Note - In a valid Binary Search Tree all keys are unique.

Example 1:
Input: arr[] = [8, 14, 45, 64, 100]
Output: True

Example 2:
Input: arr[] = [5, 6, 1, 8, 7]
Output: False

Expected Time Complexity: O(n)
Expected Space Complexity: O(1)

Constraints:
1 <= n <= 105
1 <= arr[i] <= 109
 */

package binarySearchTree.introduction;

public class ValidBST {
    static boolean isBSTTraversal(int arr[]) {
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]>=arr[i]) return false;
        }
        return true;
    }
}
