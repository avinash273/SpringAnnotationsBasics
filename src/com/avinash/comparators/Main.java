package com.avinash.comparators;

import java.lang.*;
import java.util.*;
import java.util.stream.Collectors;


class Student {
    Integer rollno;
    String name, address;

    public Integer getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Constructor
    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Used to print student details in main()
    public String toString() {
        return this.rollno+ this.name + " "
                + this.address;
    }
}

class Sortbyroll implements Comparator<Student> {
    // Used for sorting in ascending order of
    public int compare(Student a, Student b) {
        return a.rollno - b.rollno;
    }
}

class sortbynameandroll implements Comparator<Student> {
    @Override
    public int compare(Student customer1, Student customer2) {

        int NameCompare = customer1.getName().compareTo(customer2.getName());
        int AgeCompare = customer1.getRollno().compareTo(customer2.getRollno());

        // 2-level comparison
        return (NameCompare == 0) ? AgeCompare
                : NameCompare;
    }
}

class Sortbyname implements Comparator<Student> {
    // Used for sorting in ascending order of
    // name
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }

}

// Driver class
class Main {
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "bbbb", "london"));
        ar.add(new Student(131, "aaaa", "nyc"));
        ar.add(new Student(121, "cccc", "jaipur"));

        System.out.println("Unsorted");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new Sortbyroll());

        System.out.println("\nSorted by rollno");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        Collections.sort(ar, new Sortbyname());

        System.out.println("\nSorted by name");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

        List<Student> top5 = ar.stream()
                .sorted((p1, p2) -> p2.rollno.compareTo(p1.rollno))
                .limit(5)
                .collect(Collectors.toList());
    }
}