package ch17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        //예외 발생
        /*double avg0 = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
        System.out.println("예외 평균 " + avg0);*/


        OptionalDouble optional = list.stream() //Stream<Integer>
                .mapToInt(Integer::intValue) //IntStream
                .average();
        if (optional.isPresent()) {
            System.out.println("방법1 평균 = " + optional.getAsDouble());
        } else {
            System.out.println("방법1 평균 : 0.0");
        }


        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("방법2 평균 : " + avg);


        list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(a -> System.out.println("방법3 평균 : " + a));
//                .ifPresentOrElse(a -> System.out.println("방법3 평균 : " + a), () -> System.out.println("값이 없음"));


    }
}
