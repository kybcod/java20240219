package ch14.sec05.exam02;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();

        try {
            sumThread.join(); //sumThread가 종료되기를 기다림
        } catch (InterruptedException e) {
        }
        System.out.println("1~100 합 : " + sumThread.getSum());

        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
    }
}


class SumThread extends Thread {
    private long sum;

    public long getSum() {
        return sum;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
    }
}
