package ch14.sec03.exam02;

import java.awt.*;

// 0.5초 주기로 비프음 발생 동시에 프린팅
public class BeepPrintExample {
    public static void main(String[] args) {
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Toolkit toolkit = Toolkit.getDefaultToolkit();
//                for (int i = 0; i < 5; i++) {
//                    toolkit.beep();
//                    try {
//                        Thread.sleep(500);
//                    } catch (Exception e) {
//                    }
//                }
//            }
//        });


        //람다
        Thread thread = new Thread(() -> {
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            for (int i = 0; i < 5; i++) {
                toolkit.beep();
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        });

        thread.start();


        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
        }
    }
}
