package com.java.ds.tree;

/**
 * Node class for tree
 * 
 * @author royabhix
 *
 */
public class Node
{
    Node leftChild;

    Node rightChild;

    int data;

    Node ( int data )
    {
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }
}
