package ch15.lecture.p6of;

import java.util.Map;

public class C03Map {
    public static void main(String[] args) {
        //짝수개, 수정 불가
        Map<String, String> map1 = Map.of("css", "style sheets",
                "spring", "framework",
                "java", "lauguage",
                "react", "library");

        System.out.println(map1);
    }
}
