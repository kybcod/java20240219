package ch12.sec11.exam01;

public class GetClassExample {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz = Car.class;

        Class<?> clazzz = Class.forName("ch12.sec11.exam01.Car");

        Car car = new Car();
        Class<? extends Car> clazzzz = car.getClass();

        System.out.println("패키지 : " + clazz.getPackage().getName());
        System.out.println("클래스 간단 이름 : " + clazz.getSimpleName());
        System.out.println("클래스 전체 이름 : " + clazz.getName());
        System.out.println();

        System.out.println("패키지 : " + clazzz.getPackage().getName());
        System.out.println("클래스 간단 이름 : " + clazzz.getSimpleName());
        System.out.println("클래스 전체 이름 : " + clazzz.getName());
        System.out.println();

        System.out.println("패키지 : " + clazzzz.getPackage().getName());
        System.out.println("클래스 간단 이름 : " + clazzzz.getSimpleName());
        System.out.println("클래스 전체 이름 : " + clazzzz.getName());
        System.out.println();
    }
}
