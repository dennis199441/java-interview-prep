package com.dennis.tree;

import java.util.ArrayList;
import java.util.List;

public class TreeLeftView {

  public List<Integer> treeLeftView(TreeNode root) {
    List<Integer> out = new ArrayList<>();
    int[] maxLevel = { 0 };
    treeLeftViewHelper(root, maxLevel, 1, out);
    return out;
  }

  public void treeLeftViewHelper(TreeNode node, int[] maxLevel, int curLevel, List<Integer> out) {
    if (node == null) {
      return;
    }
    if (curLevel > maxLevel[0]) {
      out.add(node.data);
      maxLevel[0] = curLevel;
    }
    treeLeftViewHelper(node.left, maxLevel, curLevel + 1, out);
    treeLeftViewHelper(node.right, maxLevel, curLevel + 1, out);
  }
}
