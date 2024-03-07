package ch07.sec08.exam02;

import ch06.sec13.exam01.package1.B;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();
        
        Bus bus = new Bus();
        driver.drive(bus);

        Taxi taxi = new Taxi();
        driver.drive(taxi);
    }
}
