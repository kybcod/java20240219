package ch07.lecture.p7object;

import java.math.BigDecimal;
import java.util.Scanner;

public class C01Object {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        String s1 = "java";
        Scanner scanner = new Scanner("");
        BigDecimal bd = new BigDecimal("3");

        handlerInstance(arr1);
        handlerInstance(s1);
        handlerInstance(scanner);
        handlerInstance(bd);
    }

    public static void handlerInstance(Object o) {
        String s = o.toString();
        int code = o.hashCode();
        boolean b = o.equals(null);

        System.out.println("s = " + s);
        System.out.println("code = " + code);
        System.out.println("b = " + b);
    }
}
