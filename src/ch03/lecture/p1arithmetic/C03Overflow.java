package ch03.lecture.p1arithmetic;

public class C03Overflow {
    public static void main(String[] args) {
        //byte(1), short(2), int(4), long(8)
        //float(4), double(8)

        //overflow : 산술연산 시 저장공간의 한계를 넘어서 원하지 않는 값을 얻음
        int a = 2_000_000_000;
        int b = 1_000_000_000;
        int c = a + b;
        System.out.println("c = " + c);

        //overflow를 방지하기 위해서는 적절한 data type를 선택해야 함.
        long d = 2_000_000_000;
        long e = 1_000_000_000;

        long f = d + e;
        System.out.println("f = " + f);

    }
}
