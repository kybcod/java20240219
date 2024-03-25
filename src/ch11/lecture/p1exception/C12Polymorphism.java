package ch11.lecture.p1exception;

import java.util.List;

public class C12Polymorphism {
    public static void main(String[] args) {
        try {
            Class.forName("java.lang.String"); //ClassNotFoundException
            List.of().get(0); //IndexOutOfBoundException
            Integer.parseInt("hundred"); //NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("코드1");
        } catch (Exception e) {
            //catch 블럭 순서는 중요
            System.out.println("코드2");


        }
    }
}
