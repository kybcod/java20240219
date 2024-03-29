package ch19.lecture.p1network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C03Computer2 {
    public static void main(String[] args) throws IOException {
        //서버에 연결해서 Socket 만들기
        Socket socket = new Socket("172.30.1.73", 9000);

        try (socket) {
            //Socket에서 InputStream 꺼내기
            //BufferedInputStream 연결
            InputStream is = socket.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);

            //FileOutputSTream 만들기(파일명 아무거나)
            //BufferedOutputStream 연결
            OutputStream fos = new FileOutputStream("temp/down.png");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            //BufferdInputStream 에서 읽은 데이터
            //BufeeredOutputStream 으로 쓰기
            //마지막 flush
            try (is; bis; fos; bos;) {
                byte[] data = new byte[1024];
                int len = 0;
                while ((len = bis.read(data)) != -1) {
                    bos.write(data, 0, len);
                }
                bos.flush();
            }
        }


    }
}
