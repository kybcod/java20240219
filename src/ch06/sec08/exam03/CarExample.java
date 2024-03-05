package ch06.sec08.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.setGas(5);
        if (mycar.isLeft()) {
            System.out.println("출발합니다.");
            mycar.run();
        }
        System.out.println("gas를 주입하세요.");

    }
}
