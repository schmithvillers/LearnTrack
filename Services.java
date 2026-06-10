package com.airtribe.learntrack;
import java.util.ArrayList;
import java.util.List;

class StudentService {

    private final ArrayList<Student> students =
            new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public ArrayList<Student> getAllStudents() {
        return students;
    }

    public Student findStudentById(int id)
            throws EntityNotFoundException {

        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }

        throw new EntityNotFoundException(
                "Student not found");
    }

    public void deactivateStudent(int id)
            throws EntityNotFoundException {

        Student s = findStudentById(id);
        s.setActive(false);
    }
}

class CourseService {

    private final ArrayList<Course> courses =
            new ArrayList<>();

    public void addCourse(Course course) {
        courses.add(course);
    }

    public ArrayList<Course> getAllCourses() {
        return courses;
    }

    public Course findCourseById(int id)
            throws EntityNotFoundException {

        for (Course c : courses) {
            if (c.getId() == id) {
                return c;
            }
        }

        throw new EntityNotFoundException(
                "Course not found");
    }
}

class EnrollmentService {

    private final ArrayList<Enrollment> enrollments =
            new ArrayList<>();

    public void addEnrollment(
            Enrollment enrollment) {

        enrollments.add(enrollment);
    }

    public List<Enrollment> getAllEnrollments() {
        return enrollments;
    }

    public List<Enrollment> getByStudentId(
            int studentId) {

        List<Enrollment> result =
                new ArrayList<>();

        for (Enrollment e : enrollments) {

            if (e.getStudentId() == studentId) {
                result.add(e);
            }
        }

        return result;
    }
}