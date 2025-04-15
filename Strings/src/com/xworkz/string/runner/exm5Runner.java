package com.xworkz.string.runner;

public class exm5Runner {
    public static void main(String[] args) {
        String sentence = "Java is fun to learn";
        String target = "fun";

        boolean found = false;

        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The word \"" + target + "\" is present in the sentence.");
        } else {
            System.out.println("The word \"" + target + "\" is NOT present in the sentence.");
        }
    }
}

