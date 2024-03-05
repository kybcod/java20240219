package ch06.lecture.p3constructor;

public class C01Constructor {
    public static void main(String[] args) {
        System.out.println("1");

        // new와 생성자 코드 실행으로 객체 생성
        C01MyClass obj = new C01MyClass();

        System.out.println("2");

    }
}

class C01MyClass {
    //필드


    //생성자 : constructor
    //객체 생성 시 실행되는 코드블럭
    //생성자 이름은 클래스명과 같음
    //필요하면 파라미터 작성 가능

    C01MyClass() {
        // 객체 생성 시 처음 실행되어야 하는 코드들
        // 보통 필드 값 초기화
        // 초기 설정

        System.out.println("객체 생성 시 초기화 코드");
    }


    //메소드
}
