package cz.educanet;

import cz.educanet.bst.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();

        bt.insert(6);
        bt.insert(4);
        bt.insert(8);
        bt.insert(3);
        bt.insert(5);
        bt.insert(7);
        bt.insert(9);

        System.out.println(bt.contains(7));
        System.out.println(bt.depth());
    }
}