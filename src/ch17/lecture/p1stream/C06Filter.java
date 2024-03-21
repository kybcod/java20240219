package ch17.lecture.p1stream;

import java.util.List;

import static java.lang.System.out;

public class C06Filter {
    public static void main(String[] args) {
        List<String> list = List.of("java", "css", "spring", "html", "react");
        list.stream()
                .filter(e -> e.length() % 2 == 0)
                .forEach(out::println);

        out.println();

        list.stream()
                .filter(e -> e.length() % 2 == 1)
                .forEach(out::println);
    }
}
