package com.dennis.tree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IdenticalTreeTest {
    
    final IdenticalTree it = new IdenticalTree();

    @Test
    public void isIdenticalTest1() {
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(3);


        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(3);

        assertTrue(it.isIdentical(root1, root2));
    }

    @Test
    public void isIdenticalTest2() {
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(3);


        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);        

        assertFalse(it.isIdentical(root1, root2));
    }
}
