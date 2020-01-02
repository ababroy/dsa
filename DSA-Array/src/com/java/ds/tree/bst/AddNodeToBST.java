package com.java.ds.tree.bst;

import com.java.ds.tree.Node;

public class AddNodeToBST
{
    Node root;

    /**
     * To be inserted Node
     * 
     * @param data
     */
    public void add ( int data )
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
}
