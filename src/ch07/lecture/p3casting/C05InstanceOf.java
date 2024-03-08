package ch07.lecture.p3casting;

public class C05InstanceOf {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a instanceof A);
        System.out.println(a instanceof B);
        System.out.println(a instanceof C);
        System.out.println(a instanceof D);
        System.out.println(a instanceof E);
        System.out.println(a instanceof F);
    }
}

//@formatter:off
class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends B{}
class F extends C{}
