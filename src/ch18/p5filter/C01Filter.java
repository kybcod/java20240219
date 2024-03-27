package ch18.p5filter;

import java.io.*;

public class C01Filter {
    public static void main(String[] args) throws IOException {
        // 어떤 I/O Stream을
        // 다른 I/O Stream으로 변경해서 사용할 수 있다.
        // InputStreamReader : byte stream 을 character stream으로 연결

        String file = "temp/output3.txt";
        InputStream is = new FileInputStream(file);

        Reader reader = new InputStreamReader(is);

//        int data1 = is.read(); //한 바이트
        int data1 = 0;
        while ((data1 = reader.read()) != -1) {
            System.out.print((char) data1);
        }
        is.close();

//        Reader reader = new FileReader(file);
//        try (reader) {
//            int data = 0;
//            while ((data = reader.read()) != -1) {
//                System.out.print((char) data);
//            }
//        }

    }
}
