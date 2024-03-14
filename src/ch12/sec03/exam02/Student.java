package ch12.sec03.exam02;

import java.util.Objects;

public class Student {
    private int no;
    private String name;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNo() {
        return no;
    }

    @Override
    public int hashCode() {
        int hashCode = no + name.hashCode();
        return hashCode;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student student) {
            if (no == student.getNo() && name.equals(student.getName()))
                return true;
        }
        return false;
    }
}
