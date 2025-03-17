package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String name;
    private int group;
    private int cours;
    private int[] grades;

    public Student(String name, int group, int cours, int[] grades) {
        this.name = name;
        this.group = group;
        this.cours = cours;
        this.grades = grades;
    }

    public int[] getGrades() {
        return grades;
    }

    private static double averageGrade(int[] grades) {

        double a = ((Arrays.stream(grades).sum()) / (double) grades.length);

        return a;
    }

    public static void deleteStudent(ArrayList<Student> students) {
        int lengthOfStudents = students.size();
        int i = 0;
        while (i < lengthOfStudents) {
            if (averageGrade(students.get(i).grades) < 3) {
                students.remove(i);
            } else i++;
        }
    }

    public static void transferCourse(ArrayList<Student> students) {
        int lengthOfStudents = students.size();
        int i = 0;
        while (i < lengthOfStudents) {
            if (averageGrade(students.get(i).grades) >= 3) {
                lengthOfStudents--;
                students.get(i).cours++;
            } else i++;
        }

    }
}

