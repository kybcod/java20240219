package c02.lecture.p02type;

import java.awt.*;
import java.util.Scanner;

public class C17Scanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        var name = scanner.nextLine();

        System.out.print("나이를 입력하세요 : ");
        var age = scanner.nextLine();

        System.out.print("주소를 입력하세요 : ");
        var address = scanner.nextLine();

        var desc = STR."저는 \{address}에 사는 \{age}세 \{name}입니다.";
        System.out.println("소개 : " + desc);

        scanner.close();
    }
}
