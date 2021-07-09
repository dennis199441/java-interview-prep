package com.dennis.tree;

public class InvertTree {
    
    public void invert(TreeNode root) {
        if (root == null) return;
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = tmp;
        invert(root.left);
        invert(root.right);
    }

}
