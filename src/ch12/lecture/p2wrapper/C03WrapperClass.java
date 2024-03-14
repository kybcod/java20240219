package ch12.lecture.p2wrapper;

public class C03WrapperClass {
    public static void main(String[] args) {
        int a = 5;
        Integer b = 5; //auto boxing
        Number c = 5; //auto boxing
        Object d = 5; //auto boxing

        Integer e = null; //ok, 참조타입이니까(가리키는 객체가 없다.)
//        int f = null; //기본타입은 x(값이 없다이므로 null은 안된다.)
    }
}
