package ch05.lecture.p2string;

public class C01String {
    public static void main(String[] args) {
        // 08.String.png

        String s1 = new String("son");
        String s2 = new String("lee");
        String s3 = new String("son");

        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));

        System.out.println(s1 == s2); // false
        System.out.println(s1 == s3); // false

        System.out.println(s1);
        System.out.println(s3);

        System.out.println(s1.contentEquals(s3));
        System.out.println(s1.equals(s3));

        System.out.println(s1.contentEquals(s2));
        System.out.println(s1.equals(s2));


        String str1 = "안녕";
        String str2 = "하세요";
        String str3 = "안녕";

        System.out.println(str1.contentEquals(str3));
        System.out.println(str1.equals(str3));

        System.out.println(str1.contentEquals(str2));
        System.out.println(str1.equals(str2));
    }
}
