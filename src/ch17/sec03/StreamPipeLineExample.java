package ch17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("유미선", 30)


        );

        //방법1
        Stream<Student> studentStreamstream = list.stream();
        IntStream scoreStream = studentStreamstream.mapToInt(student -> student.getScore());
        double avg1 = scoreStream.average().getAsDouble();
        System.out.println("avg1 = " + avg1);

        //방법2
        double avg2 = list.stream() //list를 스트림으로 바꾸고
                .mapToInt(student -> student.getScore()) //score를 받아서 정수형으로 변환하고
                .average() //평균 내고
                .getAsDouble(); //Double 타입으로 변환
        System.out.println("avg2 = " + avg2);

        //고전적 방법
        double sum = 0;
        for (Student student : list) {
            sum += student.getScore();
        }
        double avg3 = sum / list.size();
        System.out.println("avg3 = " + avg3);
    }
}

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}