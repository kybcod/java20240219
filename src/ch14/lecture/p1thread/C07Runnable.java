package ch14.lecture.p1thread;

public class C07Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 3000; i++) {
                System.out.println(i);
            }
        });

        thread.start();

        for (int i = 0; i < 30000; i++) {
            System.err.println(i);
        }
    }
}
