package com.dennis.tree;

import java.util.ArrayList;
import java.util.List;

public class Traversal {
    
    public List<Integer> inOrder(TreeNode root) {
        List<Integer> order = new ArrayList<>();
        _inOrder(root, order);
        return order;
    }

    public void _inOrder(TreeNode node, List<Integer> order) {
        if (node == null) return;
        _inOrder(node.left, order);
        order.add(node.data);
        _inOrder(node.right, order);
    }

    public List<Integer> preOrder(TreeNode root) {
        List<Integer> order = new ArrayList<>();
        _preOrder(root, order);
        return order;
    }

    public void _preOrder(TreeNode node, List<Integer> order) {
        if (node == null) return;
        order.add(node.data);
        _preOrder(node.left, order);
        _preOrder(node.right, order);
    }

    public List<Integer> postOrder(TreeNode root) {
        List<Integer> order = new ArrayList<>();
        _postOrder(root, order);
        return order;

    }

    public void _postOrder(TreeNode node, List<Integer> order) {
        if (node == null) return;
        _postOrder(node.left, order);
        _postOrder(node.right, order);
        order.add(node.data);
    }
}
