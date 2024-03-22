package ch17.lecture.p1stream;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class C13Collect {
    public static void main(String[] args) {
        List<String> list = List.of("java", "spring", "css", "html", "react");
        List<Integer> result1 = new ArrayList<>();
        for (String s : list) {
            result1.add(s.length());
        }
        System.out.println("result1 = " + result1); // [4,6,3,4,5]


        //요소들을 리스트에 담는다
        ArrayList<Integer> result = list.stream()
                .collect(() -> new ArrayList<Integer>(),
                        (c, e) -> c.add(e.length()),
                        (a, b) -> a.addAll(b));

        System.out.println("result = " + result);

        List<Integer> result3 = list.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("result3 = " + result3);
    }
}
