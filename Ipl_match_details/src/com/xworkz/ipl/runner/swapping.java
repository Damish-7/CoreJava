package com.xworkz.ipl.runner;

public class swapping {
    public static void main(String[] args) {
        String str1 = "Today";
        String str2 = "Tuesday";

        System.out.println("Before swap:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("\nAfter swap:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}

