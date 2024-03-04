package ch06.sec06.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCal = new Calculator();

        myCal.powerOn();

        int reuslt1 = myCal.plus(5, 6);
        System.out.println("reuslt1 = " + reuslt1);

        int x = 10;
        int y = 4;
        double result2 = myCal.divide(x, y);
        System.out.println("result2 = " + result2);

        myCal.powerOff();
    }
}
