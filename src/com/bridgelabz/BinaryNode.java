package com.bridgelabz;

public class BinaryNode<K extends  Comparable<K>>{
    int key;
    BinaryNode<K> left;
    BinaryNode<K> right;

    public BinaryNode(int key) {
        this.key = key;
        this.left = null;
        this.right =null;
    }
}


