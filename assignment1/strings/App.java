// package com.cbfacademy.strings;

package assignment1.strings;

public class App {
    public static void main( String[] args ) {
        // System.out.println( "Hello World!" );
        System.out.println(areEqual("Goat", "Mouse"));
        // System.out.println(concatenate("Henry", "Will", "Prosper!"));
        // System.out.println(format("Mango", 13, 68));
    };

    public static String concatenate(String word1, String word2, String word3) {
        // TODO: Write code that concatenates the input parameters and returns the result
        // throw new RuntimeException("Not implemented");
        String resultString = word1 + " " + word2 + " " + word3;
        return resultString;
    };

    public static Boolean areEqual(String word1, String word2) {
        // TODO: Write code to determine whether the input parameters are equal strings
        // throw new RuntimeException("Not implemented");
        boolean comparisonResult = word1 == word2;
        return comparisonResult;
    };

    public static String format(String item, int quantity, double price) {
        // TODO: Write code to return a string formatted as follows: 
        // "Item: [item]. Price: £[amount]. Quantity: [quantity]". 
        // The date should be formatted as DD/MM/YYYY, e.g. 24/10/2023
        // throw new RuntimeException("Not implemented");
        String formattedString = String.format("Item: [%s]. Price: £[%.2f]. Quantity: [%d]", item, price, quantity);
        return formattedString;
    };
};


