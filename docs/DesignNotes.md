# Design Notes

## Why I Used ArrayList Instead of Array

I used `ArrayList` instead of normal arrays because the number of students, courses, and enrollments is not fixed. Arrays have a fixed size once they are created, which makes them less flexible for applications where data can be added or removed during runtime.

`ArrayList` provides dynamic resizing, making it easier to store and manage records without worrying about the initial capacity

---

## Where I Used Static Members and Why

Static members were used in the `IdGenerator` utility class.

```java
private static int studentCounter = 1000;
private static int courseCounter = 2000;
private static int enrollmentCounter = 3000;
```

Static methods were used to generate unique IDs:

```java
public static int getNextStudentId()
public static int getNextCourseId()
public static int getNextEnrollmentId()
```

I used static members because ID counters should be shared across the entire application. Every time a new student, course, or enrollment is created, the same counter should be updated regardless of which object is making the request.

This ensures:

* Unique IDs
* Centralized ID generation
* No need to create an `IdGenerator` object

---

## Where I Used Inheritance and What I Gained From It

Inheritance was implemented using the following hierarchy:

```text
Person
├── Student
└── Trainer
```

The `Person` class contains common attributes:

```java
id
firstName
lastName
email
```

The `Student` and `Trainer` classes inherit these properties from `Person`, avoiding code duplication.

I also used method overriding to demonstrate polymorphism:

```java
getDisplayName()
```

Benefits gained from inheritance:

1. **Code Reusability**

   * Common fields and methods are written once in the `Person` class.

2. **Reduced Duplication**

   * Student and Trainer classes automatically inherit shared behavior.

3. **Better Maintainability**

   * Changes to common attributes only need to be made in one place.

4. **Polymorphism**

   * Different implementations of `getDisplayName()` can be provided by subclasses while using a common interface.

Inheritance made the project more organized and aligned with Object-Oriented Programming principles.
