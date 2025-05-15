package oop.q3;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public boolean removeStudent(Student s) {
        return students.remove(s);
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.println(student.name + " " + student.surname + " from " + student.country);
        }
    }

    public String getStudentInfoStrange(Student s) {

        final String MY_NAME = "Anzor";
        final String MY_SURNAME = "Tsiskarishvili";
        final String MY_PERSONAL_NUMBER = "08601040620";
        final String MY_CURRENT_COURSES = "Object Oriented Programming, Computer Organization, "
                + "Calculus II, English Language Course, "
                + "Mathematical Foundation of Computing";

        if (s.name.equals(MY_NAME) && s.surname.equals(MY_SURNAME)) {
            if (students.contains(s)) {
                return MY_CURRENT_COURSES;
            } else {
                return MY_PERSONAL_NUMBER;
            }
        }

        if (students.contains(s)) {
            return s.info;
        }

        return null;
    }
}