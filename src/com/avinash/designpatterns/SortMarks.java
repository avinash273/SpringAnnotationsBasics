package com.avinash.designpatterns;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student {

    public String name;
    public Integer marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class SortMarks {
    public static void main(String[] args) {
        Student s1 = new Student("Avinash", 90);
        Student s2 = new Student("Akash", 98);
        Student s3 = new Student("Mullai", 91);
        Student s4 = new Student("Ankita", 96);
        Student s5 = new Student("jack", 89);
        Student s6 = new Student("john", 100);
        Student s7 = new Student("ram", 99);
        Student s8 = new Student("sam", 95);

        ArrayList<Student> marksSort = new ArrayList<>();
        marksSort.add(s1);
        marksSort.add(s2);
        marksSort.add(s3);
        marksSort.add(s4);
        marksSort.add(s5);
        marksSort.add(s6);
        marksSort.add(s7);
        marksSort.add(s8);

        List<Student> top5 = marksSort.stream()
                .sorted((p1, p2) -> p2.marks.compareTo(p1.marks))
                .limit(5)
                .collect(Collectors.toList());

        System.out.println("Top 5");
        for (Student each : top5) {
            System.out.println(each.marks + " " + each.name);
        }
    }
}
