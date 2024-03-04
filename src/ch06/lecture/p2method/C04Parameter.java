package ch06.lecture.p2method;

public class C04Parameter {
    public static void main(String[] args) {
        C04Calculator cal = new C04Calculator();

        //메소드 호출 시 파라미터에 값(매개값, 인수, argument)을 줘야함.
        cal.printSum(1, 2);
        cal.printSum(9, 13);
        cal.printSum(200, 300);

        System.out.println();

        cal.printDivide(3.14, 0.5);
        cal.printDivide(9.0, 3);
        cal.printDivide(10, 2);

    }
}

class C04Calculator {
    //필드들...
    //메소드들...
    void printSum(int a, int b) {
        int result = a + b;
        System.out.println("result = " + result);
    }

    void printDivide(double a, double b) {
        double result = a / b;
        System.out.println("result = " + result);
    }
}
