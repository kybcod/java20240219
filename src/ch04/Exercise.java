package ch04;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {

        //2번문제
        String grade = "B";
        int score1 = switch (grade) {
            case "A" -> 100;
            case "B" -> {
                int result = 100 - 20;
                yield result;
            }
            default -> 60;
        };

//        3번 문제
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            if (i % 3 == 0)
                sum += i;
        }
        System.out.println(sum);

//        4번문제
        while (true) {
            int num1 = (int) (Math.random() * 6) + 1;
            int num2 = (int) (Math.random() * 6) + 1;
            System.out.println(STR."(\{num1}, \{num2})");

            if (num1 + num2 == 5)
                break;
        }

//        5번문제
        int result = 0;
        int x, y = 0;
        for (x = 0; x <= 10; x++) {
            for (y = 0; y <= 10; y++) {
                result = 4 * x + 5 * y;
                if (result == 60) {
                    System.out.println(STR."(\{x}, \{y})");
                }
            }
        }

        //6번문제
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //7번문제
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int deposit = 0;
        int withdrawal = 0;

        while (run) {
            System.out.println("------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 1잔고 | 4. 종료");
            System.out.println("------------------------------------");
            System.out.print("선택>");

            String strNum = scanner.nextLine();

            if (strNum.equals("1")) {
                System.out.print("예금액>");
                deposit = Integer.parseInt(scanner.nextLine());
                System.out.println();
            } else if (strNum.equals("2")) {
                System.out.print("출금액>");
                withdrawal = Integer.parseInt(scanner.nextLine());
                System.out.println();
            } else if (strNum.equals("3")) {
                System.out.print("잔고액>");
                int balance = deposit - withdrawal;
                System.out.println(balance);
                System.out.println();
            } else if (strNum.equals("4")) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");

    }
}
