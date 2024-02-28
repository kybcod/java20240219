package ch05.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int studentNum = 0;
        String score = "";
        int[] scores = null;

        while (run) {
            System.out.println("------------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3.점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("------------------------------------------------------");
            System.out.print("선택> ");

            String menu = scanner.nextLine();


            switch (menu) {
                case "1" -> {
                    System.out.print("학생수> ");
                    String student = scanner.nextLine();
                    studentNum = Integer.parseInt(student);
                    scores = new int[studentNum];
                }

                case "2" -> {
                    for (int i = 0; i < studentNum; i++) {
                        System.out.print(STR."scores[\{i}]> ");
                        score = scanner.nextLine();
                        scores[i] = Integer.parseInt(score);
                    }
                }

                case "3" -> {
                    for (int i = 0; i < studentNum; i++) {
                        System.out.println(STR."scores[\{i}]> \{scores[i]}");
                    }

                }

                case "4" -> {
                    int max = 0;
                    for (int i = 0; i < studentNum; i++) {
                        if (max < scores[i]) {
                            max = scores[i];
                        }
                    }
                    System.out.println(STR."최고 점수 : \{max}");

                    double sum = 0.0;
                    for (int i = 0; i < studentNum; i++) {
                        sum += scores[i];
                    }
                    System.out.println(STR."평균 점수 : \{sum / studentNum}");

                }

                case "5" -> run = false;
            }

        }
        System.out.println("프로그램 종료");
    }
}
