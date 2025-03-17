package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ben", 120362, 2, new int[]{2, 3, 5, 3}));
        students.add(new Student("Adam", 463843, 3, new int[]{3, 4, 5, 3}));
        students.add(new Student("Pam", 369065, 1, new int[]{5, 3, 4, 3}));
        System.out.println(students.size());
        Student.deleteStudent(students);
        Student.transferCourse(students);


       PhoneBook phoneBooks = new PhoneBook();
        phoneBooks.add("Link", "8965325789");
        phoneBooks.add("Old","89765424678");
        phoneBooks.add("Link","876597975478");

        System.out.println(phoneBooks.get("Link"));
    }

}