package ch17.lecture.p3Optional;

import java.util.Optional;
import java.util.OptionalInt;

public class C02Primitive {
    public static void main(String[] args) {
        // OptionalInt : 기본타입 int 값을 가지고 있을 수 있는 컨테이너(없을 수도 있음)
        // OptionalDouble : double 값을 가지고 있을 수 있는 컨테이너(없을 수도 있음)
        // OptionalLong :  Long 값을 가지고 있을 수 있는 컨테이너(없을 수도 있음)

        // 만드는 법
        OptionalInt o1 = OptionalInt.of(3);
        OptionalInt o2 = OptionalInt.of(50);
        OptionalInt o3 = OptionalInt.empty();


        // isPresent : 값이 있으면 true
        // isEmpty : 값이 없으면  true
        o1.isPresent(); //t
        o3.isPresent(); //f
        o3.isEmpty(); //f
        o3.isEmpty(); //t

        // getAsInt : 값 얻기 (없으면 Exception)
        o1.getAsInt(); //3
//        o3.getAsInt(); //Exception

        // orElse : 값 없으면 기본값으로 얻기
        o1.orElse(0); //3
        o3.orElse(0); //0


    }
}
