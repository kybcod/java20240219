package ch12.sec06;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        Integer obj = 100;
        System.out.println("obj.intValue() = " + obj.intValue()); //수동 언박싱

        System.out.println(obj);
        System.out.println("obj.toString() = " + obj.toString());

        int value = obj; //자동 언박싱
        System.out.println("value = " + value);

//        obj = null;
        int resutl = obj + 100;
        System.out.println("resutl = " + resutl);
    }
}
