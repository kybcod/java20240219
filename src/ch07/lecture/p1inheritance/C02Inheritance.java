package ch07.lecture.p1inheritance;

import ch06.sec13.exam01.package2.C;

public class C02Inheritance {
    public static void main(String[] args) {
        C02Child child1 = new C02Child();
        child1.method1();
        child1.method2();

        C02Child2 child2 = new C02Child2();
        child1.method1();
        child1.method2();
    }
}

//부모 클래스, 상위 클래스, super 클래스
class C02Parent {
    public void method1() {

    }
}

// 자식/하위/서브 클래스, child/sub 클래스
class C02Child extends C02Parent {
    public void method2() {

    }
}

class C02Child2 extends C02Parent {

}

