package ch18.lecture.p2inputSream;

import java.io.*;

public class C05DogPng {
    public static void main(String[] args) {

        String inputFileName = "temp/dog.png";
        String outputFileName = "temp/dog-copy.png";

        try (InputStream is = new FileInputStream(inputFileName);
             OutputStream os = new FileOutputStream(outputFileName)) {

            byte[] img = new byte[1_021_296];
            int len = 0; //바이트 길이
            while ((len = is.read(img)) != -1) {
                os.write(img);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
