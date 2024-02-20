package c02.sec07;

public class PromotionExample {
    public static void main(String[] args) {
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue = " + intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 유니코드 = " + intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue = " + longValue);

        longValue = 100;
        float floastValue = longValue;
        System.out.println("floastValue = " + floastValue);

        floastValue = 100.5F;
        double doubleValue = floastValue;
        System.out.println("doubleValue = " + doubleValue);
    }
}
