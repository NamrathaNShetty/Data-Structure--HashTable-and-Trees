package com.bridgelabz;

public class MyBinaryTree <K extends Comparable<K>> {
    BinaryNode<K> root;

    /*Method to add keys
     * Create New node
     * If root equals to null then root will be new node
     * Else current node will be root and parent will be null
     * If key less than root assigning that to left side
     * If current equals to null then left node will be new parent node for left subtree
     * * If key greater than root assigning that to right side
     * If current equals to null then right node will be new parent node for right subtree
     */
    public void add(int Key) {
        BinaryNode<K> newNode = new BinaryNode<K>(Key);
        if (root == null) {
            root = newNode;
            return;
        } else {
            BinaryNode<K> current = root;
            BinaryNode<K> parent = null;
            while (true) {
                parent = current;

                if (Key < current.key) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    /*Print method
     *If left node is not equal to null print left node
     * Print root node
     * If left node is not equal to null print right node
     */
    public void print(BinaryNode<K> node) {
        if (node.left != null)
            print(node.left);
        System.out.print(node.key + " ");
        if (node.right != null)
            print(node.right);

    }

    /*Search node
     *If root is null or key is there at root then return root
     * If root value is greater than key return left node
     * If root value is lesser than key return left node
     */
    public BinaryNode<K> search(BinaryNode<K> root, int key) {
        if (root == null || root.key == key)
            return root;
        if (root.key > key)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    public boolean searchNode(int value) {
        root = search(root, value);
        if (root != null)
            return true;
        else
            return false;
    }
}


