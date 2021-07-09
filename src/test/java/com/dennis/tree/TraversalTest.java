package com.dennis.tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

public class TraversalTest {
    
    final Traversal t = new Traversal();

    @Test
    public void inOrderTraversalTest1() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        int[] expected = {1, 2, 3};
        List<Integer> out = t.inOrder(root);
        assertNotNull(out);
        assertEquals(3, out.size());
        for (int i = 0; i < out.size(); i++) {
            assertEquals(Integer.valueOf(expected[i]), out.get(i));
        }
    }

    @Test
    public void preOrderTraversalTest1() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        int[] expected = {2, 1, 3};
        List<Integer> out = t.preOrder(root);
        assertNotNull(out);
        assertEquals(3, out.size());
        for (int i = 0; i < out.size(); i++) {
            assertEquals(Integer.valueOf(expected[i]), out.get(i));
        }
    }

    @Test
    public void postOrderTraversalTest1() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        int[] expected = {1, 3, 2};
        List<Integer> out = t.postOrder(root);
        assertNotNull(out);
        assertEquals(3, out.size());
        for (int i = 0; i < out.size(); i++) {
            assertEquals(Integer.valueOf(expected[i]), out.get(i));
        }
    }
}
