package ch06.lecture.p3constructor;

public class C09DefaultConstructor {
    public static void main(String[] args) {
        C09MyClass1 obj1 = new C09MyClass1(33);
        C09MyClass2 obj2 = new C09MyClass2();
        C09MyClass3 obj3 = new C09MyClass3();
        C09MyClass4 obj4 = new C09MyClass4();
    }
}

class C09MyClass4 {
    int age;

    //필요하면 만들어서 써야함
    public C09MyClass4() {
    }

    public C09MyClass4(int age) {
        this.age = age;
    }

}

class C09MyClass3 {
    //필드 x, 생성자 x, 메소드 x
    //생성자를 작성하지 않으면 파라미터 없는 생성자가 자동 추가
    // no(zero)-args constructor (default constructor)
    // 파라미터 없는 생성자, 기본 생성자
    // 단, 생성자를 작성하면 추가되지 않음
}

class C09MyClass2 {
    public C09MyClass2() {
    }
}

class C09MyClass1 {
    int age;

    public C09MyClass1(int age) {
        this.age = age;
    }
}