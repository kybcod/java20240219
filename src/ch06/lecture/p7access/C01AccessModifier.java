package ch06.lecture.p7access;

public class C01AccessModifier {
    public static void main(String[] args) {
        C01MyClass o1 = new C01MyClass();
        o1.age = 30;
//        o1.address="seoul"; //private
        o1.name = "son"; //package private
    }

}

//package private
//public 안되는 이유: 하나의 파일에 하나의 public class만 작성 가능
class C01My {
}
