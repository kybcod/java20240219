package ch12.sec03.exam04;

public class RecordExample {
    public static void main(String[] args) {

        Member m = new Member("winter", "눈송이", 25); //Member 객체 생성
        System.out.println(m.id()); // 해당 객체의 필드 값 출력
        System.out.println(m.name());// 해당 객체의 필드 값 출력
        System.out.println(m.age());// 해당 객체의 필드 값 출력
        System.out.println(m.toString());
        System.out.println();

        Member m1 = new Member("winter", "눈송이", 25);
        Member m2 = new Member("winter", "눈송이", 25);
        System.out.println("m1.hashCode() = " + m1.hashCode()); //m1.hashCode() = 306065155
        System.out.println("m2.hashCode() = " + m2.hashCode()); //m2.hashCode() = 306065155
        System.out.println("m1.equals(m2) = " + m1.equals(m2)); //true
    }
}
