package com.ttpsc.bitecodelab.records.model;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Student {

    private final String name;
    private final String secondName;
    private final Set<Group> groups;
    private final List<Grade> grades;

    public Student(String name, String secondName, Set<Group> groups, List<Grade> grades) {
        this.name = name;
        this.secondName = secondName;
        this.groups = groups;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public Set<Group> getGroups() {
        return groups;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(secondName, student.secondName) &&
                Objects.equals(groups, student.groups) &&
                Objects.equals(grades, student.grades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, secondName, groups, grades);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", groups=" + groups +
                ", grades=" + grades +
                '}';
    }
}
