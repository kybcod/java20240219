package ch11.lecture.p3custom;

public class C03Custom {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();

            String message = e.getMessage();
            System.out.println("message = " + message);
        }
    }

    public static void method1() {
        throw new BreakDoorHandleException("문고리가 고장남");

    }

}

// 직접 만드는 exception
// 1. Exception : checked Exception
// 2. RuntimeException : unchecked Exception

class BreakDoorHandleException extends RuntimeException {

    public BreakDoorHandleException(String message) {
        super(message);
    }

    public BreakDoorHandleException() {
    }

}