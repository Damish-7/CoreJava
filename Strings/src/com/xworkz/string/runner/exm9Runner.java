package com.xworkz.string.runner;

public class exm9Runner {
    public static void main(String[] args) {
        String sentence = "Java is fun to learn";

        int spaceCount = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        System.out.println("Number of spaces: " + spaceCount);
    }
}

