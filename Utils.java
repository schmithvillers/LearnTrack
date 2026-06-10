package com.airtribe.learntrack;
class IdGenerator {

    private static int studentCounter = 1000;
    private static int courseCounter = 2000;
    private static int enrollmentCounter = 3000;

    public static int getNextStudentId() {
        return ++studentCounter;
    }

    public static int getNextCourseId() {
        return ++courseCounter;
    }

    public static int getNextEnrollmentId() {
        return ++enrollmentCounter;
    }
}

class InputValidator {

    public static boolean isValidEmail(String email) {
        return email != null
                && email.contains("@")
                && email.contains(".");
    }
}