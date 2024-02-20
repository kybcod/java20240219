package c02.lecture.p02type;

import java.math.BigDecimal;

public class C10Double {
    public static void main(String[] args) {
        //double(float)은 근사값으로 저장됨
        double a = 0.1;
        double b = 0.2;
        System.out.println(a);
        System.out.println(b);

        double c = a + b;
        System.out.println(c);

        BigDecimal d = new BigDecimal("0.1");
        BigDecimal e = new BigDecimal("0.2");
        BigDecimal f = d.add(e);
        System.out.println(f);
    }
}
