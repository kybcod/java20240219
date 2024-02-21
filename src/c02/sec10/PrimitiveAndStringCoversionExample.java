package c02.sec10;

public class PrimitiveAndStringCoversionExample {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);
        System.out.println("value3 = " + value3);

        String str1 = String.valueOf((10));
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);
        String str4 = Double.toString(3.14);

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
        System.out.println("str4 = " + str4);

        String str = "5";
        double var1 = Double.parseDouble(str);
        System.out.println("var1 = " + var1);
    }
}
