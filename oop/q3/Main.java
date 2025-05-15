package oop.q3;

public class Main {
    public static void main(String[] args) {
        University university = new University();

        Student me = new Student("Anzor", "Tsiskarishvili", "Georgia", ".");

        Student other1 = new Student("Alice", "Smith", "Canada", "Computer Science major");
        Student other2 = new Student("Bob", "Johnson", "UK", "Mathematics major");

        university.addStudent(me);
        System.out.println("Me in university: " +
                university.getStudentInfoStrange(me));

        university.removeStudent(me);
        System.out.println("Me not not in university: " +
                university.getStudentInfoStrange(me));

        university.addStudent(other1);
        System.out.println("Other student in university: " +
                university.getStudentInfoStrange(other1));

        System.out.println("Other student not in university: " +
                university.getStudentInfoStrange(other2));

        System.out.println("\nCurrent students:");
        university.addStudent(me);
        university.addStudent(other2);
        university.printStudents();
    }
}