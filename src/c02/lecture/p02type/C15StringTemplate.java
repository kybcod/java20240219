package c02.lecture.p02type;

public class C15StringTemplate {

    public static void main(String[] args) {
        //java21부터 사용가능
        String name = "jane";
        String age = "50";

        String desc = "my name is " + name + "and age is " + age;
        System.out.println(desc);

        String desc2 = String.format("my name is %s and age is %s", name, age);
        System.out.println(desc2);

        String desc3 = STR."my name is \{name} and age is \{age}";
        System.out.println(desc3);

        String address = "서울";
        String country = "한국";
        String desc4 = STR."저는 \{country}에 있는 \{address}에 삽니다.";
        System.out.println(desc4);
    }
}
