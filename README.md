# Lab 4 – Spring Core: Annotation-Based Configuration

## Description
This project demonstrates Spring Core concepts using annotation-based Java configuration instead of XML-based configuration.

The Spring IoC container manages bean creation, dependency injection, and bean scopes.



## Concepts Implemented

1. Inversion of Control (IoC)
2. Spring Bean Creation
3. Literal Dependency Injection
4. Setter-Based Dependency Injection
5. Constructor-Based Dependency Injection
6. Object Dependency Injection
7. Collection Dependency Injection
8. Singleton Bean Scope
9. Prototype Bean Scope

## Annotation-Based Configuration

The project uses:

- `@Configuration` – Defines the Spring configuration class.
- `@Bean` – Registers objects as Spring beans.
- `@Scope("singleton")` – Defines singleton scope.
- `@Scope("prototype")` – Defines prototype scope.
- `AnnotationConfigApplicationContext` – Initializes the Spring IoC container.



## Expected Results

- Spring successfully creates and manages Student, Address, and Subject beans.
- Dependency injection works successfully.
- Multiple Subject beans are injected into a List.
- Singleton scope returns the same object.
- Prototype scope returns different objects.

