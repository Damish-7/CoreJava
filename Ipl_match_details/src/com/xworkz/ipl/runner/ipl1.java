package com.xworkz.ipl.runner;

public class ipl1 {
    public static void main(String[] args) {
        String input = "rcb will win the match against csk";
        String[] words = input.split(" ");

        for (String word : words) {
            System.out.print(word.length() + " ");
        }
    }
}
