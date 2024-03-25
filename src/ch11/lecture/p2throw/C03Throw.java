package ch11.lecture.p2throw;

public class C03Throw {
    public static void main(String[] args) {
        try {
            someMethod1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // throws : 메소드 선언부에 발생하는 예외 작성
    public static void someMethod1() throws Exception {
        throw new Exception();
        //checked exception은 꼭 예외처리를 하고 throw를 써야한다.(throws Exception)

    }
}
