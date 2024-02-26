package ch04.lecture.p4for;

public class C03For {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }

        int i = 0;
        for (; i < 3; i++) {
            System.out.println("i = " + i);
        }
        System.out.println("i = " + i);
    }
}
