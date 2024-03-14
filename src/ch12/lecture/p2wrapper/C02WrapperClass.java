package ch12.lecture.p2wrapper;

public class C02WrapperClass {
    public static void main(String[] args) {
        int a = 3;
        long b = a;

        Integer c = a; //auto boxing
//        Long d = a; //
//        Long e = c;

        Number e = a;
        Object f = a;
        //기본 타입도 참조 타입 처럼 쓸 수 있게 되었다.


    }
}
