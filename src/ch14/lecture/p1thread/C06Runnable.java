package ch14.lecture.p1thread;

public class C06Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 30000; i++) {
                    System.out.println(i);
                }
            }
        });

        thread.start();

        for (int i = 0; i < 30000; i++) {
            System.err.println(i);
        }
    }
}
