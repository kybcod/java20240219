package c02.lecture.p02type;

import java.util.Scanner;

public class c16Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Line = scanner.nextLine();//키보트 입력 받음
        System.out.println("Line = " + Line);
        
        scanner.close();
    }
}
