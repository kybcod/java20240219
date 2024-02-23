package ch04.lecture.p1if;

import java.util.Random;
import java.util.Scanner;

public class C06RPS {
    public static void main(String[] args) {
        //가위바위보 게임 만들기
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("가위(1), 바위(2), 보(3)를 선택하세요 : ");

        int user = Integer.parseInt(scanner.nextLine());
        int computer = random.nextInt(1, 4);

        if (user == 1) {
            System.out.println("user = 가위");
        } else if (user == 2) {
            System.out.println("user = 바위");
        } else if (user == 3) {
            System.out.println("user = 보");
        }

        switch (computer) {
            case 1:
                System.out.println("computer = 가위");
                break;
            case 2:
                System.out.println("computer = 바위");
                break;
            case 3:
                System.out.println("computer = 보");
                break;
        }

        if (user == computer) {
            System.out.println("비겼습니다.");
        } else if ((user == 1 && computer == 2) || (user == 2 && computer == 3) || (user == 3 && computer == 1)) {
            System.out.println("졌습니다.");
        } else {
            System.out.println("이겼습니다.");
        }

    }
}
