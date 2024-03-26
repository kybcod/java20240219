package ch14.lecture.p1thread;

public class C03Thread {
    public static void main(String[] args) {
        // Thread 만들기


        // 2. Runable 인터페이스 구현
        // -> run 메소드(추상 메소드) 재정의


        //Thread 시작하기
        MyThread3 thread = new MyThread3();
        thread.start(); //Thread 시작하기, run() 직접 실행X -> start로

        for (int i = 0; i < 30000; i++) {
            System.err.println(i);
        }
    }
}

// 1. Thread 자식 클래스로 생성(Thread  클래스 상속)
// -> run 메소드 재정의
class MyThread3 extends Thread {
    @Override
    public void run() {
        //이 Thread가 할 일
        for (int i = 0; i < 30000; i++) {
            System.out.println(i);
        }
    }
}