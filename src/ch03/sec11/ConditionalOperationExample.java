package ch03.sec11;

public class ConditionalOperationExample {
    public static void main(String[] args) {
        int score = 85;
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        System.out.println(score + "점은 " + grade + "등급입니다.");


        String str1 = "안녕";
        String str2 = "녕";
        Boolean result = str1.contains(str2);
        int answer = result ? 1 : 2;
        System.out.println("answer = " + answer);

        int i = 0;
        int a = i == 0 ? 1 : 2;
        System.out.println("a = " + a);
    }
}
