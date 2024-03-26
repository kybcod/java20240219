package ch14.lecture.p2concurrency;

public class C02SynchronizedBlock {
    public static void main(String[] args) throws InterruptedException {

        MyObject2 o = new MyObject2();
        Thread t1 = new Thread(o);
        Thread t2 = new Thread(o);

        o.setLock(new Object());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(o.getValue());
    }
}

class MyObject2 implements Runnable {
    private long value;
    private Object lock;

    public long getValue() {
        return value;
    }

    public void setLock(Object o) {
        this.lock = o;
    }

    public void update() {
        for (int i = 0; i < 30000; i++) {
//            synchronized block : ()괄호 안의 객체를 차지한 스레드만 실행 가능
            synchronized (this) {
                value++; //문제 공간 : read value, add 1, write value
            }


        }
    }

    @Override
    public void run() {
        update();
    }
}
