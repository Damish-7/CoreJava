package com.xworkz.ipl.runner;

public class Welcom {
    public static void main(String[] args) {
        String input = "you are welcome";
        input = input.toLowerCase();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);


            if (isVowel(ch)) {

                char nextChar = (char)(ch + 1);

                while (isVowel(nextChar)) {
                    nextChar++;
                }
                output.append(nextChar);
            } else {
                output.append(ch);
            }
        }
        System.out.println(output.toString());
    }
    public static boolean isVowel(char ch) {
        return "aeiou".indexOf(ch) != -1;
    }
}
