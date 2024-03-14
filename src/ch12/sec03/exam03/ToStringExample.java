package ch12.sec03.exam03;


public class ToStringExample {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("삼성전자", "안드로이드");

        String strObj = smartPhone.toString();
        System.out.println(strObj);
        System.out.println(smartPhone);//매개값이 기본타입 or 문자열 -> 값을 그대로 출력
    }
}
