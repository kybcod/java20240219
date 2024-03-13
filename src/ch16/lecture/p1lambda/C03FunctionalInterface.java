package ch16.lecture.p1lambda;

public class C03FunctionalInterface {

}

//@FunctionalInterface 아님
interface C03MyInterface1 {
}

@FunctionalInterface //ok
interface C03MyInterface2 {
    void method1();
}

//@FunctionalInterface 아님
interface C03MyInterface3 {
    void method2();

    void mehtod3();
}

@FunctionalInterface //ok 추상메소드만 하나이어야 합니다.
interface C03MyInterface4 {
    void method1();

    default void method2() {

    }
}

@FunctionalInterface //ok
interface C03MyInterface5 {
    void method1(); //추상메소드

    //    Object의 public method는 포함하지 않음
    String toString();

    int hashCode();

    boolean equals(Object o);
}