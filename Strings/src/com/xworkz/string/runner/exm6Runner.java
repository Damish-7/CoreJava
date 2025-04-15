package com.xworkz.string.runner;

public class exm6Runner {
    public static void main(String[] args) {
        String sentence = "java is fun and java is powerful";
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            int count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "";  // Mark this word as counted
                }
            }
            if (!words[i].equals("")) {
                System.out.println(words[i] + " → " + count);
            }
        }
    }
}

