package ch07.lecture.p1inheritance;

public class C03Polymorphism {
    public static void main(String[] args) {
        C03Child child1 = new C03Child();
        C03Parent parent1 = child1;
        C03Parent child2 = new C03Child();

        C03Parent p1 = new C03Parent();
//        C02Child c1 = p1;//x
    }
}

class C03Parent {

}

class C03Child extends C03Parent {

}
