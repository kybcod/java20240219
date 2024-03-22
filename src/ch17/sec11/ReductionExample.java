package ch17.sec11;

import java.util.List;

public class ReductionExample {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student("홀길동", 92),
                new Student("신용권", 95),
                new Student("김자바", 88)
        );
        int sum1 = students.stream()
                .mapToInt(Student::getScore)
                .sum();
        System.out.println("sum1 = " + sum1);

        int sum2 = students.stream()
                .mapToInt(Student::getScore)
                .reduce(0, (a, b) -> a + b);
        System.out.println("sum2 = " + sum2);

    }
}

class Student {
    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}