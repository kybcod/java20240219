package ch18.lecture.p1outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C08OutputStream {
    public static void main(String[] args) {
        String fileName = "temp/output8.data";

        try {
            OutputStream os = new FileOutputStream(fileName);
            try (os) {
                os.write(243512); //1 byte 쓰기
                os.write(249012); //1 byte 쓰기

                byte[] data = new byte[10];

                os.write(data); // 10 bytes 쓰기
                os.write(data); // 10 bytes 쓰기

                os.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
