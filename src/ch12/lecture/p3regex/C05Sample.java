package ch12.lecture.p3regex;

public class C05Sample {
    public static void main(String[] args) {
        // {n} : 정확히 n번
        //{n,m} : n~m번
        // {n,} : n번 이상
        // + : {1, } : 1번 이상
        // * : {0, } : 0번 이상
        // ? : {0,1} : 한번 또는 없음
        // [0-9] : \d
        // whitespace : \s
        // word character [a-zA-Z0-9_] : \w
        // 모든 문자 : .

        //_,$, 영문 대소문자, 숫자 조합, 단 숫자로 시작하면 안됨

        String pattern = "[^\\d][_$a-zA-Z0-9]+";
//        String pattern = "[_$a-zA-Z][_$a-zA-Z0-9]+";
        System.out.println("num".matches(pattern));
        System.out.println("var7".matches(pattern));
        System.out.println("class".matches(pattern));
        System.out.println("PI".matches(pattern));
        System.out.println("MAX_VALUE".matches(pattern));
        System.out.println("7num".matches(pattern)); //false
        System.out.println("$num".matches(pattern));
        System.out.println("nu$m".matches(pattern));
    }
}


