package ch18.p5filter;

import java.io.*;

public class C01Filter {
    public static void main(String[] args) throws IOException {
        // 어떤 I/O Stream을
        // 다른 I/O Stream으로 변경해서 사용할 수 있다.

        String file = "temp/output3.txt";
        InputStream is = new FileInputStream(file);

        // InputStreamReader : byte stream 을 character stream으로 연결

        Reader reader = new InputStreamReader(is);

//        int data1 = is.read(); //한 바이트
        int data1 = reader.read();
        System.out.println((char) data1);

        is.close();
    }
}
