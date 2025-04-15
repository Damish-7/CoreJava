package com.xworkz.string.runner;

public class exm2Runner {
    public static void main(String[] args){
        String sentence = "Java is fun to learn";

        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            count++;
        }

        System.out.println("Number of characters: " + count);
    }
}



