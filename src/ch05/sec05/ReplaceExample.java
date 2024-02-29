package ch05.sec05;

public class ReplaceExample {
    public static void main(String[] args) {
        //replace : 특정 문자열을 바꾼 문자열을 리턴(원본 문자열이 바뀌지 않음)
        String oldStr = "자바 문자열을 불변입니다. 자바 문자열은 String입니다.";
        String newStr = oldStr.replace("자바", "JAVA");

        System.out.println(oldStr);
        System.out.println(newStr);

        String u = "java,  spring, css, java, html";
        String v = u.replace("java", "자바");
        System.out.println(u);
        System.out.println(v);
    }
}
