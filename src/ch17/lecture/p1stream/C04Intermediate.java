package ch17.lecture.p1stream;

import java.util.List;
import java.util.stream.Stream;

public class C04Intermediate {
    public static void main(String[] args) {
        // 중간 연산(Intermediate operation)
        // filter, map, distinct, sorted, peek, limit, skip

        // 중간 연산은 최종연산이 있을 때만 실행
        List<Integer> list = List.of(3, 5, 9, 8, 1, 6, 4);
        Stream<Integer> stream1 = list.stream();

        Stream<Integer> stream2 = stream1.filter(e -> {
            System.out.println(e);
            return true;
        });

        long count = stream2.count();

        // 중간 Stream 변수 없이 사용 (일반적인 사용 방법)
        long count1 = list.stream()
                .filter(e -> {
                    System.out.println(e);
                    return true;
                }).count();

        stream1.count();

        System.out.println("프로그램 종료");
    }
}
