package ch07.sec07.exam02;

import ch06.sec13.exam01.package2.C;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;

        parent.method1();
        parent.method2();
//        parent.method3(); //호출불가능
    }
}
