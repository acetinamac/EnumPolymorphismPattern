package com.github.arminmac.general;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWaysListIterate {
    public static void main(String[] args) {
        List<String> courses = List.of("C", "Core Java", "J2EE", "Spring", "Hibernate", "Python");

        for(int i = 0; i < courses.size(); i++) {
            String course = courses.get(i);
            printCourses(course);
        }

        for (String course: courses) {
            printCourses(course);
        }

        Iterator<String> it = courses.iterator();
        while (it.hasNext()) {
            String course = it.next();
            printCourses(course);
        }

        System.out.println("---------------Stream");
        courses.forEach(course -> printCourses(course));

        System.out.println("---------------Stream method static");
        courses.forEach(DifferentWaysListIterate::printCourses);
    }

    private static void printCourses(String course) {
        System.out.println("course name :: " + course);
    }
}
