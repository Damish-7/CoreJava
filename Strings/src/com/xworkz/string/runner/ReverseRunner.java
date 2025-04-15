package com.xworkz.string.runner;

public class ReverseRunner {
    public static void main(String[] args){
        String name = "Damish";
        int count = 0;
        for (char c : name.toCharArray())
        {
            count++;
        }
        for(int i = count - 1; i >= 0; i--)
        {
            System.out.print(name.charAt(i));
        }
    }
}