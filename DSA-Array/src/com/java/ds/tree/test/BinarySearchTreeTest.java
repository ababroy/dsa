package com.java.ds.tree.test;

import org.junit.Test;

import com.java.ds.tree.bst.BST;

public class BinarySearchTreeTest
{
    // 13, 3, 4, 12, 14, 10, 5, 1, 8, 2, 7, 9, 11, 6, 15
    @Test
    public void test ()
    {
        BST bst = new BST();
        bst.addNode( 13 );
        bst.addNode( 3 );
        bst.addNode( 4 );
        bst.addNode( 12 );
        bst.addNode( 14 );
        bst.addNode( 10 );
        bst.addNode( 5 );
        bst.addNode( 1 );
        bst.addNode( 8 );
        bst.addNode( 2 );
        bst.addNode( 7 );
        bst.addNode( 9 );
        bst.addNode( 11 );
        bst.addNode( 6 );
        bst.addNode( 15 );

        bst.printTree(); 
    }
}
