package ch04.lecture.p2switch;

public class C01Switch {
    public static void main(String[] args) {
        String city = "제주";
        switch (city) {
            //값이 "서울"
            case "서울":
                System.out.println("statement 2");
                break;

            //값이 "제주"
            case "제주":
                System.out.println("statement 3");
                break;

            //"값이 "부산"
            case "부산":
                System.out.println("statement 4");
                break;
        }
    }
}
