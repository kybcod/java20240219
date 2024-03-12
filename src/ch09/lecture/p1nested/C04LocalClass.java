package ch09.lecture.p1nested;

public class C04LocalClass {
    void method1() {
        final int j = 1; //값을 한번은 꼭 할당해야 한다.
        int k = 2; //effectively final
//        k = 2; //값 변경하면 loacl class에서 못씀
        class LocalClass {
            void method1() {
                int i = 0;
                //
                System.out.println(i);
                i = 1; //변경 가능

                //감싸고 있는 메소드의 final 지역변수만 사용 가능
                System.out.println(j);
//                j = 5; // 감싸고 있는 메소드의 변수의 값 변경 불가능
                System.out.println(k);
            }

        }
    }
}
