/*
Unique Binary Tree Requirements

Geek wants to know the traversals required to construct a unique binary tree. Given a pair of traversal, return true
if it is possible to construct unique binary tree from the given traversals otherwise return false.
Each traversal is represented with an integer: preorder - 1, inorder - 2, postorder - 3.

Example 1:
Input:
a = 1, b=2
Output: 1
Explanation: We can construct binary tree using inorder traversal and preorder traversal.

Example 2:
Input: a = 1, b=3
Output: 0
Explanation: We cannot construct binary tree using preorder traversal and postorder traversal.

Constraints:
1 <= a,b <=3
Your Task:
You don't need to read input or print anything. Your task is to complete the function isPossible() which takes a and b as input parameters and returns true or false.

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)
 */

package binaryTrees.hard;

public class UniqueBinaryTreeRequirements {
    public static boolean isPossible(int a, int b){
        if(a==2 && b==2) return false;
        if(a==2 || b==2) return true;
        return false;
    }
}
