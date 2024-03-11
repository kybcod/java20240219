package ch08.sec07;

public interface Service {
    default void defaultMethod1() {
        System.out.println("defaultMethod1 종속 코드");
        defaultCommon();

    }

    default void defaultMethod2() {
        System.out.println("defaultMethod2 종속 코드");
        defaultCommon();
    }

    private static void defaultCommon() {
        System.out.println("defaultMethod1 종속 코드A");
        System.out.println("defaultMethod1 종속 코드B");
    }

    static void staticMethod1() {
        System.out.println("staticMethod1 종속 코드");
        staticCommon();
    }

    static void staticMethod2() {
        System.out.println("staticMethod2 종속 코드");
        staticCommon();
    }

    private static void staticCommon() {
        System.out.println("defaultMethod1 종속 코드C");
        System.out.println("defaultMethod1 종속 코드D");
    }
}
