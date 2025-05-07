package com.xworkz.ipl.runner;

public class ipl {
    public static void main(String[] args) {
        String input = "RCB will win the match";
        String[] result = input.split(" ");

        for (int i = 0; i < result.length; i++) {
            if (result[i].length() == 3) {
                result[i] = reverse(result[i]);
            }
        }

        String output = String.join(" ", result);
        System.out.println(output);
    }

    public static String reverse(String word) {
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        return reverse;
    }
}
