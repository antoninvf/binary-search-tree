package cz.educanet.bst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepthBSTTest {

    @Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeDepthIsCorrect() {
        BinarySearchTree bt = new BinarySearchTree();

        bt.insert(6);
        bt.insert(4);
        bt.insert(8);
        bt.insert(3);
        bt.insert(5);
        bt.insert(7);
        bt.insert(9);

        assertEquals(3, bt.depth());
    }
}