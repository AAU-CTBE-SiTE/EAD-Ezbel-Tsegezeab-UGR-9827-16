package com.craft;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        // Create Spring IoC Container
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Literal Dependency Injection
        Student student1 =
                context.getBean("literalStudent", Student.class);

        System.out.println("LITERAL INJECTION:");
        System.out.println(student1);


        // Setter-Based Injection
        Student student2 =
                context.getBean("setterStudent", Student.class);

        System.out.println("\nSETTER INJECTION:");
        System.out.println(student2);


        // Constructor-Based Injection
        Student student3 =
                context.getBean("constructorStudent", Student.class);

        System.out.println("\nCONSTRUCTOR INJECTION:");
        System.out.println(student3);


        // Collection Dependency Injection
        Student student4 =
                context.getBean("collectionStudent", Student.class);

        System.out.println("\nCOLLECTION INJECTION:");
        System.out.println(student4);

        student4.getDetails();


        // Singleton Scope
        Student student5 =
                context.getBean("singletonStudent", Student.class);

        Student student6 =
                context.getBean("singletonStudent", Student.class);

        System.out.println("\nSINGLETON SCOPE:");

        System.out.println(student5 == student6);


        // Prototype Scope
        Student student7 =
                context.getBean("prototypeStudent", Student.class);

        Student student8 =
                context.getBean("prototypeStudent", Student.class);

        System.out.println("\nPROTOTYPE SCOPE:");

        System.out.println(student7 == student8);


        // Close Context
        context.close();
    }
}