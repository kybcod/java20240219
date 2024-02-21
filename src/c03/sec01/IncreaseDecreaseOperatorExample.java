package c03.sec01;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++;
        ++x;
        System.out.println("x = " + x);

        System.out.println("_____________________________");
        y--;
        --y;
        System.out.println("y = " + y);

        System.out.println("_____________________________");
        z = x++;
        System.out.println("z = " + z);
        System.out.println("x = " + x);

        System.out.println("_____________________________");
        z = ++x;
        System.out.println("z = " + z);
        System.out.println("x = " + x);

        System.out.println("_____________________________");
        z = ++x + y++;
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
