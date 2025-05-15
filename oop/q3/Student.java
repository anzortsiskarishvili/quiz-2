package oop.q3;

import java.util.Objects;

public class Student {
    public String name;
    public String surname;
    public String country;
    public String info;

    public Student(String name, String surname, String country, String info) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.info = info;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return name.equals(student.name) &&
                surname.equals(student.surname) &&
                country.equals(student.country) &&
                info.equals(student.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, country, info);
    }
}