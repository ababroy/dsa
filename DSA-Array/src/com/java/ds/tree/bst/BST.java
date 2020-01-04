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

    /**
     * data: 13, 3, 4, 12, 14, 10, 5, 1, 8, 2, 7, 9, 11, 6, 15
     * 
     * 
     * data: 50, 15, 62, 5, 20, 58, 91, 3, 8, 37, 60, 24
     */
    public static void main ( String[] args )
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
        System.out.println(  );
        bst.deleteNode( 50 );
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

            if ( left != null && right == null )
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
            else if ( left != null && right != null )
            {
                Node tmpRight = left.rightChild;
                if ( tmpRight != null )
                {
                    goMaxRightNode( tNode, tmpRight );
                }
            }

        }
        else if ( tNode.data > data ) // go left
        {
            if ( left.leftChild == null && left.rightChild == null )
            {
                if ( tNode.leftChild.data == data )
                    tNode.leftChild = null;
                else
                    System.out.println( "Data not found in the tree" );
            }
            else
            {
                traverseAndDelete( tNode.leftChild, data );
            }
        }
        else if ( tNode.data < data ) // go right
        {
            if ( right.leftChild == null && right.rightChild == null )
            {
                if ( tNode.rightChild.data == data )
                    tNode.rightChild = null;
                else
                    System.out.println( "Data not found in the tree" );
            }
            else
            {
                traverseAndDelete( tNode.rightChild, data );
            }
        }
    }

    private void goMaxRightNode ( Node target, Node tmpRight )
    {
        Node targetLeft = target.leftChild;
        Node lTemp = tmpRight.leftChild;
        Node llTemp = null;
        Node lrTemp = null;

        if ( tmpRight.rightChild != null )
        {
            goMaxRightNode( target, tmpRight.rightChild );
        }
        else if ( tmpRight.leftChild == null )
        {
            target.data = tmpRight.data;
            targetLeft.rightChild = null;
        }
        else
        {
            llTemp = lTemp.leftChild;
            lrTemp = lTemp.rightChild;
            target.data = tmpRight.data;
            tmpRight.data = tmpRight.leftChild.data;
            tmpRight.leftChild = llTemp;
            tmpRight.rightChild = lrTemp;

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
