package ch18.lecture.p1outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C09OutputStream {
    public static void main(String[] args) {
        String fileName = "temp/output9.data";
        try (OutputStream os = new FileOutputStream(fileName)) {

            os.write(34234); //1byte 쓰기

            byte[] data = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};


            os.write(data); //11bytes 쓰기
            os.write(data, 0, 10); //인덱스0부터 10개 쓰기, 10bytes 쓰기
            os.write(data, 5, 3); // 인덱스 5부터 3개쓰기(5,6,7), 3 bytes 쓰기

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
