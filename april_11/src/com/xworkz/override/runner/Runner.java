package com.xworkz.override.runner;
import com.xworkz.override.internal.*;
public class Runner {
    public static void main(String[] args) {
        School school = new HighSchool();
        school.conductClass();
        HighSchool highSchool=new HighSchool();
        highSchool.organizeEvent();
        highSchool.assignHomework();



    }
}
