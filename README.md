# LearnTrack - Student & Course Management System

## Project Overview
This project demonstrates fundamental Java concepts including Object-Oriented Programming (OOP), Collections, Exception Handling, Inheritance, Polymorphism, and Encapsulation.

---

## Technologies Used

* Java
* OOP Concepts
* ArrayList Collections
* Exception Handling
* Console-Based UI

---

## Project Structure

```text
com.airtribe.learntrack
│
├── Main.java
├── Entities.java
├── Services.java
├── Utils.java
└── Exceptions.java
```

---

## OOP Concepts Implemented

### Encapsulation

Private fields with controlled access through methods.

### Inheritance

```text
Person
├── Student
└── Trainer
```

### Polymorphism

Method overriding using:

```java
getDisplayName()
```

### Constructor Overloading

Implemented in Student class:

```java
Student(...)
Student(..., batch)
```

### Static Members

Implemented in:

```java
IdGenerator
```

Used for generating unique Student, Course, and Enrollment IDs.

---

## Class Diagram

```text
                Person
                   |
        -----------------------
        |                     |
     Student              Trainer


Student -------- Enrollment -------- Course
```

---

## How to Compile

Navigate to the project root directory and run:

```bash
javac com/airtribe/learntrack/*.java
```

---

## How to Run

```bash
java com.airtribe.learntrack.Main
```

---
