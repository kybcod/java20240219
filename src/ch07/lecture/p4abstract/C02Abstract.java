package ch07.lecture.p4abstract;

import ch06.sec13.exam01.package2.C;

public class C02Abstract {
    public static void main(String[] args) {
        C02Animal animal1 = new C02Fish();
        C02Animal animal2 = new C02Cat();
        animal1.breathe();
        animal2.breathe();

//        C02Animal animal3 = new C02Bird(); //x

    }
}

//@fomatter:off
abstract class C02Animal {

    //abstract method :몸통(boby)없는 메소드
    //하위 클래스가 꼭 재정의 해야 함.
    //추상 메소드가 있다면 클래스는 꼭 추상 클래스
    public abstract void breathe();
}

//구현클래스(concrete)
class C02Fish extends C02Animal {
    @Override
    public void breathe() {
        System.out.println("아가미 호흡");
    }
}

class C02Cat extends C02Animal {
    @Override
    public void breathe() {
        System.out.println("페 호흡");
    }
}

//자식 클래스가 추상 메소드를 재정의하지 않으면 추상클래스가 되어야 함.
abstract class C02Bird extends C02Animal {

}
