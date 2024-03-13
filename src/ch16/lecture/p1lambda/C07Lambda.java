package ch16.lecture.p1lambda;

public class C07Lambda {
    public static void main(String[] args) {
        C07MyInterface obj1 = a -> {
            for (int i = 0; i < 3; i++)
                System.out.print(a);
            System.out.println();
        };
        C07MyInterface obj2 = a -> {
            for (int i = 0; i < 2; i++)
                System.out.print(a);
            System.out.println();
        };
        C07MyInterface obj3 = a -> System.out.println(a.toUpperCase());

        obj1.method("hi");
        obj2.method("hello");
        obj3.method("spring");
    }
}

@FunctionalInterface
interface C07MyInterface {
    void method(String a);
}