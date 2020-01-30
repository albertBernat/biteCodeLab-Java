package com.ttpsc.bitecodelab.records.model;

import java.util.Objects;

public class Group {
    private final String name;
    private final Integer capacity;

    public Group(String name, Integer capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(name, group.name) &&
                Objects.equals(capacity, group.capacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity);
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
