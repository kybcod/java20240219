package c02.lecture.p01variable;

public class C01Variable {
    public static void main(String[] args) {
//        변수 : variable/ 값을 저장하는 공간의 이름
//        변수 선언 : 저장공간을 만듬 ' 타입명 변수명 '
        int a; //int 타입의 저장공간 마련, 공간의 이름이 'a'
        a = 3; //변수에 값 저장(assignment, 할당, 대입)
        System.out.println(a);
        System.out.println(a);

//       변수 b를 int 타입 선언, 변수 b에 100대입, 변수 b 출력
        int b;
        b=100;
        System.out.println(b);

        //변수명 관습 : 1. 소문자로 시작, 2. 여러 단어의 조합일 경우 각 단어의 앞글자만 대문자(ㅇ), -lowerCamelCase
        //변수명 규칙 : 1. 영문대소문자, 숫자, $, _로 구성되어야 하며 숫자로는 시작할 수 없다., 2. '_'로만 작성할 수 없음
//        같은 변수명 다시 선언할 수 없음, keywords(예약어) 사용할 수 없다.

    }
}
