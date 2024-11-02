# SOLID - Java

By following these SOLID principles, you create more flexible, maintainable code. They encourage clean OOP practices, such as Encapsulation, Abstraction, Inheritance, and Polymorphism

## 1. Single Responsibility Principle (SRP)

A class should have only one reason to change, meaning it should only have one job or responsibility.

## 2. Open/Closed Principle (OCP)

Software entities (classes, modules, functions) should be open for extension but closed for modification.

## 3. Liskov Substitution Principle (LSP)

Subtypes must be substitutable for their base types without altering the correctness of the program.

## 4. Interface Segregation Principle (ISP)

Clients should not be forced to implement interfaces they do not use.

## 5. Dependency Inversion Principle (DIP)

High-level modules should not depend on low-level modules. Both should depend on abstractions (interfaces).

---

# Docker Instructions for a Simple Java Application

`docker build -t java-solid .`

`docker run --rm java-solid`
