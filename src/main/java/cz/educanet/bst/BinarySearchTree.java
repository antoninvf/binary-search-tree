package cz.educanet.bst;

import java.util.ArrayList;

public class BinarySearchTree implements IBinarySearchTree {
    Node root;

    private Node addRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        } else {
            return current;
        }

        return current;
    }

    @Override
    public void insert(Comparable item) {
        root = addRecursive(root, (int) item);
    }

    private int depthRecursive(Node current) {
        if (current == null) {
            return 0;
        }
        int leftDepth = depthRecursive(current.left);
        int rightDepth = depthRecursive(current.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

    @Override
    public int depth() {
        return depthRecursive(root);
    }

    private boolean containsNodeRecursive(Node current, int data) {
        if (current == null) {
            return false;
        }
        if (data == current.data) {
            return true;
        }
        return data < current.data
                ? containsNodeRecursive(current.left, data)
                : containsNodeRecursive(current.right, data);
    }

    @Override
    public boolean contains(Comparable item) {
        return containsNodeRecursive(root, (int) item);
    }
}
