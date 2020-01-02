package com.java.ds.tree;

/**
 * Binary Search Tree
 * 
 * Data: 13, 3, 4, 12, 14, 10, 5, 1, 8, 2, 7, 9, 11, 6, 15
 * 
 * @author royabhix
 *
 */
public class BST
{
    Node root;

    /**
     * To be inserted Node
     * 
     * @param data
     */
    private void add ( int data )
    {
        Node nodeToAdd = new Node( data );
        if ( root == null )
        {
            root = nodeToAdd;
            return;
        }
        traverseNodeAndAdd( root, nodeToAdd );

    }

    /**
     * Method for Traverse and add the inserted node
     * 
     * @param traverseNode
     * @param nodeToAdd
     */
    private void traverseNodeAndAdd ( Node traverseNode, Node nodeToAdd )
    {
        // Node traverseNode = oldNode;
        if ( nodeToAdd.data < traverseNode.data )
        {
            if ( traverseNode.leftChild == null )
            {
                traverseNode.leftChild = nodeToAdd;
            }
            else
            {
                traverseNodeAndAdd( traverseNode.leftChild, nodeToAdd );
            }
        }
        else if ( nodeToAdd.data > traverseNode.data )
        {
            if ( traverseNode.rightChild == null )
            {
                traverseNode.rightChild = nodeToAdd;
            }
            else
            {
                traverseNodeAndAdd( traverseNode.rightChild, nodeToAdd );
            }
        }
    }

    /**
     * To print the tree
     */
    private void printTree ()
    {
        if ( root != null )
        {
            System.out.print( "BST-->Pre Order Traversal : " );
            preOrderTraversal( root );
            System.out.println();
            System.out.print( "BST-->In Order Traversal  : " );
            inOrderTraversal( root );
            System.out.println();
            System.out.print( "BST-->Post Order Traversal: " );
            postOrderTraversal( root );
        }
        else
        {
            System.out.println( "Tree is empty" );
        }
    }

    /**
     * Pre Order Traversal
     * 
     * @param traversingNode
     */
    private void preOrderTraversal ( Node traversingNode )
    {
        // Print the Node
        System.out.print( traversingNode.data + " " );
        // Left side Traverse
        if ( traversingNode.leftChild != null )
        {
            preOrderTraversal( traversingNode.leftChild );
        }
        // Right side Traverse
        if ( traversingNode.rightChild != null )
        {
            preOrderTraversal( traversingNode.rightChild );
        }
    }

    /**
     * In Order Traversal
     * 
     * @param traversingNode
     */
    private void inOrderTraversal ( Node traversingNode )
    {
        // Left side Traverse
        if ( traversingNode.leftChild != null )
        {
            inOrderTraversal( traversingNode.leftChild );
        }
        // Print the Node
        System.out.print( traversingNode.data + " " );

        // Right side Traverse
        if ( traversingNode.rightChild != null )
        {
            inOrderTraversal( traversingNode.rightChild );
        }
    }

    /**
     * Post Order Traversal
     * 
     * @param traversingNode
     */
    private void postOrderTraversal ( Node traversingNode )
    {
        // Left side Traverse
        if ( traversingNode.leftChild != null )
        {
            postOrderTraversal( traversingNode.leftChild );
        }
        // Right side Traverse
        if ( traversingNode.rightChild != null )
        {
            postOrderTraversal( traversingNode.rightChild );
        }
        // Print the Node
        System.out.print( traversingNode.data + " " );
    }

    /*
     * data: 13, 3, 4, 12, 14, 10, 5, 1, 8, 2, 7, 9, 11, 6, 15
     */
    public static void main ( String[] args )
    {
        BST bst = new BST();
        bst.add( 13 );
        bst.add( 3 );
        bst.add( 4 );
        bst.add( 12 );
        bst.add( 14 );
        bst.add( 10 );
        bst.add( 5 );
        bst.add( 1 );
        bst.add( 8 );
        bst.add( 2 );
        bst.add( 7 );
        bst.add( 9 );
        bst.add( 11 );
        bst.add( 6 );
        bst.add( 15 );

        bst.printTree();

    }
}
