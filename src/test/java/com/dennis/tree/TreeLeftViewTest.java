package com.dennis.tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

public class TreeLeftViewTest {

  final TreeLeftView tlv = new TreeLeftView();

  @Test
  public void treeLeftViewTest1() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    root.right.right = new TreeNode(6);
    int[] expected = { 1, 2, 4 };
    List<Integer> out = tlv.treeLeftView(root);
    assertNotNull(out);
    assertEquals(3, out.size());
    for (int i = 0; i < out.size(); i++) {
      assertEquals(Integer.valueOf(expected[i]), out.get(i));
    }
  }

  @Test
  public void treeLeftViewTest2() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.right = new TreeNode(4);
    root.left.right.right = new TreeNode(5);
    root.left.right.right.right = new TreeNode(6);
    int[] expected = { 1, 2, 4, 5, 6 };
    List<Integer> out = tlv.treeLeftView(root);
    assertNotNull(out);
    assertEquals(5, out.size());
    for (int i = 0; i < out.size(); i++) {
      assertEquals(Integer.valueOf(expected[i]), out.get(i));
    }
  }
}
