package com.bridgelabz;

public class HashTable {
    public static void main(String[] args) {
        System.out.println("Welcome to Hashtable Programs");
        //Creating object as hashMap for MyHashTable class
        MyHashTable<String, Integer> hashMap = new MyHashTable();
        String statement = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        //Converting  into lowercase
        String[] statementArray = statement.toLowerCase().split(" ");

        // Iteration
        for (String word : statementArray) {
            Integer count = hashMap.get(word);

            if (count == null)
                count = 1;
            else
                count = count + 1;
            hashMap.add(word, count);
        }
        hashMap.remove("avoidable");
        System.out.println(hashMap);
    }
}
