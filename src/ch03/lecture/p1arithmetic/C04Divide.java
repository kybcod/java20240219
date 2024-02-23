package ch03.lecture.p1arithmetic;

public class C04Divide {
    public static void main(String[] args) {
        //정수 나누기 연산 시 0으로 나누면 error
        int a = 3;
        int b = 0;
        if (b != 0) {
            int c = a / b;
            System.out.println("c = " + c);
        }

        int d = a % b;

    }
}
