package ch17.lecture.p1stream;

import java.util.List;

public class C03Terminal {
    public static void main(String[] args) {
        //최종 연산

        List<String> list
                = List.of("java", "css", "react", "spring", "hello world");

        //anyMatch
        boolean hasCss = list.stream()
                .anyMatch(e -> e.equals("css"));
        System.out.println("hasCss = " + hasCss);


        boolean hasJsp = list.stream()
                .anyMatch(e -> e.equals("jsp"));
        System.out.println("hasJsp = " + hasJsp); //f

        boolean hasBlank = list.stream()
                .anyMatch(e -> e.contains(" "));
        System.out.println("hasBlank = " + hasBlank);


        // allMatch
        boolean threeAndMore = list.stream()
                .allMatch(e -> e.length() >= 3);
        System.out.println("threeAndMore = " + threeAndMore);


        boolean lessTen = list.stream()
                .allMatch(e -> e.length() < 10); //f(모두는 아님)
        System.out.println("lessTen = " + lessTen);

    }
}
