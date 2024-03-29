package ch19.lecture.p1network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C03Computer1 {
    public static void main(String[] args) throws IOException {
        //ServerSocket 만들기
        //연결 기다린 후
        //연결 되면 Socket 만들기

        ServerSocket serverSocket = new ServerSocket(9000);

        Socket socket = serverSocket.accept();

        try (socket) {

            //Socket에서 OutputStream 꺼내기
            //BufferedOutputSteam  연결
            OutputStream sos = socket.getOutputStream();
            BufferedOutputStream sbos = new BufferedOutputStream(sos);

            //FileInputStream 만들기 (파일은 아무거나)
            //BufferedInputStream 연결
            InputStream fis = new FileInputStream("temp/dog2.png");
            BufferedInputStream bis = new BufferedInputStream(fis);

            //반복문
            //BufferedInputStream으로 읽은 데이터
            //BufferedoutputStream으로 출력
            try (sos; sbos; fis; bis;) {
                byte[] data = new byte[1024];
                int len = 0;
                while ((len = bis.read(data)) != -1) {
                    sbos.write(data, 0, len);
                }
                sbos.flush();
            }

            //마지막 flush


        }


    }
}
