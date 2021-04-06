package com.avinash.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Students {
    int rollNo;
    String name;
    int marks;

    public Students(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}

class CompareStudentMarks implements Comparator<Students> {

    @Override
    public int compare(Students s1, Students s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class EasyComparator {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Students s1 = new Students(1, "avinash", 98);
        Students s2 = new Students(2, "rahul", 91);
        Students s3 = new Students(3, "sam", 100);
        Students s4 = new Students(4, "canny", 33);
        Students s5 = new Students(5, "zack", 78);

        ArrayList<Students> result = new ArrayList<>();
        result.add(s1);
        result.add(s2);
        result.add(s3);
        result.add(s4);
        result.add(s5);

        Collections.sort(result, new CompareStudentMarks());

        for (Students each : result) {
            System.out.println(each.name);
        }


    }
}

