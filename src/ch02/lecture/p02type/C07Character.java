package ch02.lecture.p02type;

public class C07Character {
    public static void main(String[] args) {
        //char(2btye === 16bit) : 0~65535

        char a = 99;
        char b = 120;
        char c = 65535;
//        char d = 65536;
//        char e = -1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        char f = 969;
        System.out.println(f);

        char k = 0xac00;
        char l = '가';
        System.out.println(k);
        System.out.println(l);

        char m = 0xd7a3;
        char n = '힝';
        System.out.println(m);
        System.out.println(n);

        int o = 0x1f607;
        char[] emoji1 = Character.toChars(o);
        String emojis = new String(emoji1);
        System.out.println("emojis : " + emojis);

        int p = 0x1f3a4;
        char[] mike = Character.toChars(p);
        String mikes = new String(mike);
        System.out.println("mikes : " + mikes);


    }
}
