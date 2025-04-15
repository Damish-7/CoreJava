package com.xworkz.string.runner;

public class exm4Runner {
    public static void main(String[] args) {
        String sentence = "Java is fun to learn";
        int count = 1; // Start with 1 because there's at least one word

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println("Number of words: " + count);
    }
}

