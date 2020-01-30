package com.ttpsc.bitecodelab.records.model;

import java.util.List;
import java.util.Set;

public class SomeMain {
    public static void main(String[] args) {
        Group group1 = new Group("3ID11A", 20);
        Student student1 = new Student("Jan", "Kowalski", Set.of(group1), List.of(Grade.FIVE, Grade.THREE, Grade.FOUR));
        Student student2 = new Student("John", "Doe", Set.of(group1), List.of(Grade.FIVE, Grade.THREE, Grade.FOUR));
        Student student3 = new Student("Andrzej", "Nowak", Set.of(group1), List.of(Grade.FIVE, Grade.THREE, Grade.FOUR));

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        GroupRecord groupRecord1 = new GroupRecord("3ID11A", 20);
        StudentRecord studentRecord1 = new StudentRecord("Jan", "Kowalski", Set.of(groupRecord1), List.of(Grade.FIVE, Grade.THREE, Grade.FOUR));
        StudentRecord studentRecord2 = new StudentRecord("John", "Doe", Set.of(groupRecord1), List.of(Grade.FIVE, Grade.THREE, Grade.FOUR));
        StudentRecord studentRecord3 = new StudentRecord("Andrzej", "Nowak", Set.of(groupRecord1), List.of(Grade.FIVE, Grade.THREE, Grade.FOUR));
        System.out.println(studentRecord1);
        System.out.println(studentRecord2);
        System.out.println(studentRecord3);
    }
}
