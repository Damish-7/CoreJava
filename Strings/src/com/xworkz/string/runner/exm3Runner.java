package com.xworkz.string.runner;

public class exm3Runner {
    public static void main(String[] args) {
        String sentence = "java is fun";

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch != ' ') {  // Ignore spaces
                int count = 0;
                for (int j = 0; j < sentence.length(); j++) {
                    if (ch == sentence.charAt(j)) {
                        count++;
                    }
                }
                System.out.println(ch + " → " + count);
                sentence = sentence.replace(Character.toString(ch), " ");  // Mark the character as counted
            }
        }
    }
}

