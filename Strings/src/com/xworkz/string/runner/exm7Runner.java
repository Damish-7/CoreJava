package com.xworkz.string.runner;

public class exm7Runner {
    public static void main(String[] args) {
        String sentence = "madam";  // Example input
        boolean isPalindrome = true;

        for (int i = 0; i < sentence.length() / 2; i++) {
            if (sentence.charAt(i) != sentence.charAt(sentence.length() - 1 - i))
            {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

    }
}

