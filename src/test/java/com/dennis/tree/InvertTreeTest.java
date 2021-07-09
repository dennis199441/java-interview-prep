package com.dennis.tree;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class InvertTreeTest {
    
    final IdenticalTree idt = new IdenticalTree();
    final InvertTree it = new InvertTree();

    @Test
    public void invertTreeTest1() {
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(5);
        root1.left.left = new TreeNode(1);
        root1.right.left = new TreeNode(4);
    
        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(5);
        root2.right = new TreeNode(2);
        root2.left.right = new TreeNode(4);
        root2.right.right = new TreeNode(1);

        it.invert(root1);

        assertTrue(idt.isIdentical(root1, root2));
    }
}
