package com.bridgelabz;

import org.junit.Test;

public class MyBinaryTreeTest {
    @Test

    public static void main(String[] args) {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);

        myBinaryTree.print(myBinaryTree.root);

    }
}