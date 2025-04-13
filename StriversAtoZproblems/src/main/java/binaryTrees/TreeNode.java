package binaryTrees;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int val){
        this.val = val;
    }

    TreeNode(int val, TreeNode right, TreeNode left){
        this.val = val;
        this.right = right;
        this.left = left;
    }
}
