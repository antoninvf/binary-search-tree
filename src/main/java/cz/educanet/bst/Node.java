package cz.educanet.bst;

public class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        right = null;
        left = null;
    }
}
