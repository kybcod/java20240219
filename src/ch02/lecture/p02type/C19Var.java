package ch02.lecture.p02type;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C19Var {
    public static void main(String[] args) {
//        var : 변수의 타입을 할당되는 값으로부터 추론
        //따라서 변수의 선언과 할당을 동시에 해야 함
        //지역변수에만 사용 가능(필드, 파라미터, 리턴타입에서 사용 불가능)
        int a = 10;
        var b = 10; //b는 int로 추론됨

        String c = "hello";
        var d = "hi"; //d는 String로 추론됨

        double e = 3.14;
        var f = 3.14; //f는 double로 추론됨

//        var h; h=100; //x

        var i = 100; //정수형 literal은 무조건 int
        var j = 3.14; //실수형 literal 값은 무조건 double

        List<Map<String, Integer>> ist1 = new ArrayList<Map<String, Integer>>();
        List<Map<String, Integer>> list2 = new ArrayList<>();
        var list3 = new ArrayList<Map<String, Integer>>();

//        int var = 3; 변수명으로 사용하지 말 것


    }
}
