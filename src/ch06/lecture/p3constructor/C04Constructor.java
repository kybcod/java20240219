package ch06.lecture.p3constructor;

public class C04Constructor {
    public static void main(String[] args) {
        C04MyClass obj1 = new C04MyClass("son", 33);
        C04MyClass obj2 = new C04MyClass("lee", 22);

        System.out.println(obj1.name);
        System.out.println(obj2.name);
        System.out.println(obj1.age);
        System.out.println(obj2.age);
    }


}

class C04MyClass {
    String name;
    int age;

    C04MyClass(String initialName, int ainitialAge) {
        name = initialName;
        age = ainitialAge;
    }
}
