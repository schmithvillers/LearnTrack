package com.airtribe.learntrack;
import java.time.LocalDate;

class Person {

    protected int id;
    protected String firstName;
    protected String lastName;
    protected String email;

    public Person() {
    }

    public Person(
            int id,
            String firstName,
            String lastName,
            String email) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getDisplayName() {
        return firstName + " " + lastName;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}

class Student extends Person {

    private String batch;
    private boolean active;

    public Student(
            int id,
            String firstName,
            String lastName,
            String email,
            String batch,
            boolean active) {

        super(id, firstName, lastName, email);
        this.batch = batch;
        this.active = active;
    }

    // Constructor Overloading
    public Student(
            int id,
            String firstName,
            String lastName,
            String batch) {

        super(id, firstName, lastName, "");
        this.batch = batch;
        this.active = true;
    }

    @Override
    public String getDisplayName() {
        return "Student : " + firstName + " " + lastName;
    }

    public String getBatch() {
        return batch;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {

        return "ID: " + id +
                " | Name: " + firstName + " " + lastName +
                " | Email: " + email +
                " | Batch: " + batch +
                " | Active: " + active;
    }
}

class Trainer extends Person {

    public Trainer(
            int id,
            String firstName,
            String lastName,
            String email) {

        super(id, firstName, lastName, email);
    }

    @Override
    public String getDisplayName() {
        return "Trainer : " + firstName + " " + lastName;
    }
}

class Course {

    private int id;
    private String courseName;
    private String description;
    private int durationInWeeks;
    private boolean active;

    public Course(
            int id,
            String courseName,
            String description,
            int durationInWeeks,
            boolean active) {

        this.id = id;
        this.courseName = courseName;
        this.description = description;
        this.durationInWeeks = durationInWeeks;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {

        return "ID: " + id +
                " | Course: " + courseName +
                " | Duration: " + durationInWeeks +
                " weeks | Active: " + active;
    }
}

enum EnrollmentStatus {
    ACTIVE,
    COMPLETED,
    CANCELLED
}

class Enrollment {

    private int id;
    private int studentId;
    private int courseId;
    private LocalDate enrollmentDate;
    private EnrollmentStatus status;

    public Enrollment(
            int id,
            int studentId,
            int courseId,
            LocalDate enrollmentDate,
            EnrollmentStatus status) {

        this.id = id;
        this.studentId = studentId;
        this.courseId = courseId;
        this.enrollmentDate = enrollmentDate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public int getStudentId() {
        return studentId;
    }

    public EnrollmentStatus getStatus() {
        return status;
    }

    public void setStatus(EnrollmentStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {

        return "Enrollment ID: " + id +
                " | Student ID: " + studentId +
                " | Course ID: " + courseId +
                " | Date: " + enrollmentDate +
                " | Status: " + status;
    }
}