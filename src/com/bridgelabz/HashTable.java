package com.bridgelabz;

public class HashTable {
    public static void main(String[] args) {
        System.out.println("Welcome to Hashtable Programs");
        //Creating object as hashMap for MyHashTable class
        MyHashTable<String, Integer> hashMap = new MyHashTable();
        String statement = "To be or not to be";
        //converting statement into lowercase
        String[] statementArray = statement.toLowerCase().split(" ");

        // Iterating over the array.
        for (String word : statementArray) {
            Integer count = hashMap.get(word);

            if (count == null)
                count = 1;
            else
                count = count + 1;
            hashMap.add(word, count);
        }
        System.out.println(hashMap);
    }
}



