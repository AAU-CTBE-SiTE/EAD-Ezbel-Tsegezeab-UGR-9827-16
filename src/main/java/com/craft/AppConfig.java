package com.craft;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Arrays;

@Configuration
public class AppConfig {

    // Literal Dependency Injection
    @Bean
    public Student literalStudent() {

        Student student = new Student();

        student.setId(101);
        student.setName("John Doe");
        student.setAge(20);

        return student;
    }

    // Address Bean
    @Bean
    public Address address() {

        Address address = new Address();

        address.setCity("Addis");
        address.setCountry("Ethiopia");

        return address;
    }

    // Subject Bean 1
    @Bean
    public Subject math() {

        Subject subject = new Subject();

        subject.setSubjectName("Maths 101");

        return subject;
    }

    // Subject Bean 2
    @Bean
    public Subject javaSubject() {

        Subject subject = new Subject();

        subject.setSubjectName("Java EE");

        return subject;
    }

    // Setter-Based Injection
    @Bean
    public Student setterStudent(Address address) {

        Student student = new Student();

        student.setId(101);
        student.setName("John Doe");
        student.setAge(20);

        student.setAddress(address);

        return student;
    }

    // Constructor-Based Injection
    @Bean
    public Student constructorStudent(Address address) {

        return new Student(
                102,
                "Jane Doe",
                21,
                address
        );
    }

    // Collection Dependency Injection
    // Collection Dependency Injection
    @Bean
    public Student collectionStudent(
            Address address,
            java.util.List<Subject> subjects) {

        Student student = new Student();

        student.setId(103);
        student.setName("John Doe");
        student.setAge(20);

        student.setAddress(address);

        student.setSubjects(subjects);

        return student;
    }

    // Singleton Scope
    @Bean
    @Scope("singleton")
    public Student singletonStudent() {

        Student student = new Student();

        student.setName("Singleton Student");

        return student;
    }

    // Prototype Scope
    @Bean
    @Scope("prototype")
    public Student prototypeStudent() {

        Student student = new Student();

        student.setName("Prototype Student");

        return student;
    }
}