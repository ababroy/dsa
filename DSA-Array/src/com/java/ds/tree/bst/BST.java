package com.java.ds.tree.bst;

import com.java.ds.tree.Node;

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

    public void deleteNode ( int data )
    {
        if ( root != null )
        {
            traverseAndDelete( root, data );
        }
        else
        {
            System.out.println( "Tree is empty" );
        }
    }

    /*
     * data: 13, 3, 4, 12, 14, 10, 5, 1, 8, 2, 7, 9, 11, 6, 15
     */
    public static void main ( String[] args )
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

        bst.deleteNode( 12 );
        System.out.println();
        bst.printTree();

    }

    private void traverseAndDelete ( Node dNode, int data )
    {
        Node tNode = dNode;
        Node left = tNode.leftChild;
        Node right = tNode.rightChild;
        if ( tNode.data == data )
        {

            if ( left != null )
            {
                if ( left.rightChild != null )
                {
                    tNode.data = left.rightChild.data;
                    left.rightChild = null;
                }
                else if ( ( left.leftChild == null || left.leftChild != null ) )
                {
                    tNode.data = left.data;
                    tNode.leftChild = left.leftChild;
                }
                else
                {
                    System.out.println( "Loop hole" );
                }
            }
            else if ( left == null && right != null )
            {
                tNode.data = right.data;
                tNode.rightChild = right.rightChild;
                tNode.leftChild = right.leftChild;
            }

        }
        else if ( tNode.data > data ) // go left
        {
            traverseAndDelete( tNode.leftChild, data );
        }
        else if ( tNode.data < data ) // go right
        {
            traverseAndDelete( tNode.rightChild, data );
        }
    }

    /**
     * To be inserted Node
     * 
     * @param data
     */
    public void addNode ( int data )
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
    public void printTree ()
    {
        if ( root != null )
        {
            // System.out.print( "BST-->Pre Order Traversal : " );
            // preOrderTraversal( root );
            // System.out.println();
            System.out.print( "BST-->In Order Traversal  : " );
            inOrderTraversal( root );
            // System.out.println();
            // System.out.print( "BST-->Post Order Traversal: " );
            // postOrderTraversal( root );
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

}
