package com.craft;

import lombok.Data;
import lombok.ToString;
import java.util.List;

@Data
@ToString
public class Student {
    private int id;
    private String name;
    private int age;
    private Address address;
    private List<Subject> subjects;
    // Default constructor
    public Student() {
    }

    // Parameterized constructor
    public Student(int id, String name, int age, Address address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void getDetails() {
        System.out.println("Student Name: " + this.getName());
        int index = 1;
        for (Subject subject : subjects) {
            System.out.println("Subject " + index + ": " + subject.getSubjectName());
            index++;
        }
    }
}