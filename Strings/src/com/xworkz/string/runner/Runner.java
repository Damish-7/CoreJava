package com.xworkz.string.runner;

public class Runner {
    public static void main(String[] args) {

        String name = "Ravi";
        String updatedName = name.concat(" C");  // Fix here
        System.out.println("name: " + name);
        System.out.println("updatedName: " + updatedName);

        String u_name = "Ravi C";

        if (updatedName.equals(u_name)) {  // Use .equals() to compare string content
            System.out.println("matching");
            System.out.println("address of match");
        } else {
            System.out.println("not matching");
            System.out.println("not matching");
            System.out.println("not matching");
        }
    }
}
