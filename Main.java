package com.airtribe.learntrack;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static StudentService studentService =
            new StudentService();

    static CourseService courseService =
            new CourseService();

    static EnrollmentService enrollmentService =
            new EnrollmentService();

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== LearnTrack =====");
            System.out.println("1. Student Management");
            System.out.println("2. Course Management");
            System.out.println("3. Enrollment Management");
            System.out.println("0. Exit");

            int choice = getInt();

            switch (choice) {

                case 1:
                    studentMenu();
                    break;

                case 2:
                    courseMenu();
                    break;

                case 3:
                    enrollmentMenu();
                    break;

                case 0:
                    System.exit(0);

                default:
                    System.out.println("Invalid Option");
            }
        }
    }

    private static void studentMenu() {

        while (true) {

            System.out.println("\n--- Student Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Deactivate Student");
            System.out.println("0. Back");

            int choice = getInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    deactivateStudent();
                    break;

                case 0:
                    return;
            }
        }
    }

    private static void courseMenu() {

        while (true) {

            System.out.println("\n--- Course Menu ---");
            System.out.println("1. Add Course");
            System.out.println("2. View Courses");
            System.out.println("0. Back");

            int choice = getInt();

            switch (choice) {

                case 1:
                    addCourse();
                    break;

                case 2:
                    viewCourses();
                    break;

                case 0:
                    return;
            }
        }
    }

    private static void enrollmentMenu() {

        while (true) {

            System.out.println("\n--- Enrollment Menu ---");
            System.out.println("1. Enroll Student");
            System.out.println("2. View All Enrollments");
            System.out.println("0. Back");

            int choice = getInt();

            switch (choice) {

                case 1:
                    enrollStudent();
                    break;

                case 2:
                    viewEnrollments();
                    break;

                case 0:
                    return;
            }
        }
    }

    private static void addStudent() {

        System.out.print("First Name: ");
        String first = scanner.nextLine();

        System.out.print("Last Name: ");
        String last = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Batch: ");
        String batch = scanner.nextLine();

        Student student = new Student(
                IdGenerator.getNextStudentId(),
                first,
                last,
                email,
                batch,
                true);

        studentService.addStudent(student);

        System.out.println("Student Added.");
    }

    private static void viewStudents() {

        for (Student s :
                studentService.getAllStudents()) {

            System.out.println(s);
        }
    }

    private static void searchStudent() {

        try {

            System.out.print("Student ID: ");
            int id = getInt();

            System.out.println(
                    studentService.findStudentById(id));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void deactivateStudent() {

        try {

            System.out.print("Student ID: ");
            int id = getInt();

            studentService.deactivateStudent(id);

            System.out.println("Student Deactivated");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void addCourse() {

        System.out.print("Course Name: ");
        String name = scanner.nextLine();

        System.out.print("Description: ");
        String desc = scanner.nextLine();

        System.out.print("Duration Weeks: ");
        int weeks = getInt();

        Course course = new Course(
                IdGenerator.getNextCourseId(),
                name,
                desc,
                weeks,
                true);

        courseService.addCourse(course);

        System.out.println("Course Added");
    }

    private static void viewCourses() {

        for (Course c :
                courseService.getAllCourses()) {

            System.out.println(c);
        }
    }

    private static void enrollStudent() {

        System.out.print("Student ID: ");
        int studentId = getInt();

        System.out.print("Course ID: ");
        int courseId = getInt();

        Enrollment enrollment =
                new Enrollment(
                        IdGenerator.getNextEnrollmentId(),
                        studentId,
                        courseId,
                        LocalDate.now(),
                        EnrollmentStatus.ACTIVE);

        enrollmentService.addEnrollment(
                enrollment);

        System.out.println("Enrollment Added");
    }

    private static void viewEnrollments() {

        for (Enrollment e :
                enrollmentService.getAllEnrollments()) {

            System.out.println(e);
        }
    }

    private static int getInt() {

        while (true) {

            try {

                return Integer.parseInt(
                        scanner.nextLine());

            } catch (Exception e) {

                System.out.print(
                        "Enter valid number: ");
            }
        }
    }
}