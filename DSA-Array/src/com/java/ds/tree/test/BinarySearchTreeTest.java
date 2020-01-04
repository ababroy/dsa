package com.java.ds.tree.test;

import org.junit.Test;

import com.java.ds.tree.bst.BST;

public class BinarySearchTreeTest
{
    /**
     * data: 13, 3, 4, 12, 14, 10, 5, 1, 8, 2, 7, 9, 11, 6, 15
     * 
     * 
     * data: 50, 15, 62, 5, 20, 58, 91, 3, 8, 37, 60, 24
     */
    @Test
    public void test ()
    {
        BST bst = new BST();

        bst.addNode( 50 );
        bst.addNode( 15 );
        bst.addNode( 62 );
        bst.addNode( 5 );
        bst.addNode( 20 );
        bst.addNode( 58 );
        bst.addNode( 91 );
        bst.addNode( 3 );
        bst.addNode( 8 );
        bst.addNode( 37 );
        bst.addNode( 60 );
        bst.addNode( 24 );

        // bst.addNode( 13 );
        // bst.addNode( 3 );
        // bst.addNode( 4 );
        // bst.addNode( 12 );
        // bst.addNode( 14 );
        // bst.addNode( 10 );
        // bst.addNode( 5 );
        // bst.addNode( 1 );
        // bst.addNode( 8 );
        // bst.addNode( 2 );
        // bst.addNode( 7 );
        // bst.addNode( 9 );
        // bst.addNode( 11 );
        // bst.addNode( 6 );
        // bst.addNode( 15 );

        bst.printTree();
        System.out.println();
        bst.deleteNode( 50 );
        System.out.println();
        bst.printTree();
    }
}
