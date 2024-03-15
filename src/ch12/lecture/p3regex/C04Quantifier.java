package ch12.lecture.p3regex;

public class C04Quantifier {
    public static void main(String[] args) {
        // 수량자
        // {n} : 정확히 n번
        //{n,m} : n~m번
        // {n,} : n번 이상
        // + : {1, } : 1번 이상
        // * : {0, } : 0번 이상
        // ? : {0,1} : 한번 또는 없음

        // {n} : n번
        String p1 = "\\d{3}"; //숫자 3개만
        System.out.println("012".matches(p1));
        System.out.println("892".matches(p1));
        System.out.println("89z".matches(p1)); //f
        System.out.println("6".matches(p1)); //f

        String p2 = "010-\\d{4}-\\d{4}";
        System.out.println("010-1234-5678".matches(p2));
        System.out.println("999-1234-5678".matches(p2)); //f
        System.out.println("010-123-5678".matches(p2)); //f
        System.out.println("010-1234-567".matches(p2)); //f
        System.out.println("0101234567".matches(p2)); //f

        //{n,m} - 문자가 n~m개
        String p3 = "[가-힣]{3,5}";
        System.out.println("손흥민".matches(p3));
        System.out.println("이강인".matches(p3));
        System.out.println("대한민국".matches(p3));
        System.out.println("한국".matches(p3));  //false
        System.out.println("서울특별시".matches(p3)); //t

        //{n,}
        String p4 = "[가-힣]{2,}";
        System.out.println("손흥민".matches(p4));
        System.out.println("이강인".matches(p4));
        System.out.println("대한민국".matches(p4));
        System.out.println("한국".matches(p4));
        System.out.println("서울특별시".matches(p4));
        System.out.println("한".matches(p4)); //f
        System.out.println("".matches(p4)); //f
        System.out.println("".matches(p4)); //f
        System.out.println("한국seoul".matches(p4)); //f
        System.out.println();

        String p5 = "[가-힣A-za-z]{1,}";
        System.out.println("한국".matches(p5));
        System.out.println("korea".matches(p5));
        System.out.println("seoul한국".matches(p5));
        System.out.println("seoul 한국".matches(p5)); //f
        System.out.println();

        // ? : {0,1} - 있거나 없거나
//        String p6 = "010-{0,1}\\d{4}-{0,1}\\d{4}";
        String p6 = "010-?\\d{4}-?\\d{4}"; //'-' 있거나 없거나
        System.out.println("010-9999-8888".matches(p6));
        System.out.println("01099998888".matches(p6));
        System.out.println("0109999-8888".matches(p6));
        System.out.println("010-99998888".matches(p6));
        System.out.println("010-999-8888".matches(p6)); //f
        System.out.println();

        // + : 1번 이상
        String p7 = "\\w+";
        System.out.println("983jf_".matches(p7));
        System.out.println("".matches(p7)); //f
        System.out.println();

        // * : 0번이상
        String p8 = "\\w*";
        System.out.println("983jf_".matches(p8));
        System.out.println("".matches(p8));

    }
}
