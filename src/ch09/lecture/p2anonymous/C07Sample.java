package ch09.lecture.p2anonymous;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class C07Sample {
    public static void main(String[] args) {
        // TODO : null 대신 익명클래스 객체 코드 작성

        //가위, 바위, 보 중 하나 출력
        Game rpsGame = new Game() {
            @Override
            public void play() {
                Random random = new Random();
                int num = random.nextInt(3);
                String[] rcp = {"가위", "바위", "보"};

                String rcpPrint = rcp[num];
                System.out.println(rcpPrint);

            }
        };
        rpsGame.play();

        Game lottoGame = new Game() {

            //            //1~45사이의 값 중 한개 출력
            @Override
            public void play() {
                int num = (int) (Math.random() * 45) + 1;
                System.out.println(num);
            }
        };

        Game lottoGame2 = new Game() {// 1~45 값 중 6개(중복없이) 출력
            @Override
            public void play() {
                int[] lotto = new int[6];
                for (int i = 0; i < lotto.length; i++) {
                    lotto[i] = (int) (Math.random() * 45) + 1;

                    //중복제거
                    for (int j = 0; j < i; j++) {
                        if (lotto[j] == lotto[i]) {
                            i--;
                            break;
                        }
                    }
                }

                System.out.println(Arrays.toString(lotto));
            }
        };

        lottoGame.play();
        lottoGame2.play();
    }
}

interface Game {
    void play();

}


//{
//int[] numbers = new int[6];
//int size = 0;
//
//Random random = new Random();
//
//                while (size < 6) {
//// 번호 뽑고
//int randomNumber = random.nextInt(45) + 1;
//
//// 있는 지 없는 지? 판단한는 변수
//boolean alreadyHave = false;
//
//// 이미 있는 지?
//                    for (int i = 0; i < size; i++) {
//        if (numbers[i] == randomNumber) {
//// 있다는 표시하고
//alreadyHave = true;
//        // 반복문 종료
//        break;
//        }
//        }
//
//        if (!alreadyHave) {
//// 없으면 배열에 추가하고
//// size 를 1 증가
//numbers[size] = randomNumber;
//size++;
//        }
//        // 다음 번호 뽑기
//        }
//        }