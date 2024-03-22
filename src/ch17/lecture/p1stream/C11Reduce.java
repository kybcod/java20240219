package ch17.lecture.p1stream;

import java.util.List;

public class C11Reduce {
    public static void main(String[] args) {
        //reduce : reduction 최종연산

        List<String> list = List.of("java", "css", "spring", "html");

        //고전적 방법
        //javacsspringhtml
        String result1 = "";
        for (String s : list) {
            result1 += s; //apply
        }
        System.out.println(result1);

        List<Integer> list1 = List.of(3, 6, 9, 10);
        int sum1 = 0;
        for (Integer i : list1) {
            sum1 += i;
        }
        System.out.println(sum1);


        //stream 활용
        String result2 = list.stream()
                .reduce("", (result, e) -> result + e);
        System.out.println("result2 = " + result2);

        Integer result3 = list1.stream()
                .reduce(0, (s, v) -> s + v); //(초기값, 이전과 현재 연산)
        System.out.println("result3 = " + result3);

    }
}
