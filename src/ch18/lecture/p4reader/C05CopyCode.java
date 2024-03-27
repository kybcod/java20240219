package ch18.lecture.p4reader;

import java.io.*;

public class C05CopyCode {
    public static void main(String[] args) {
        String src = "src/ch18/lecture/p4reader/C05CopyCode.java";
        String des = "temp/C05CopyCode.txt";

        try {
            Reader reader = new FileReader(src);
            Writer writer = new FileWriter(des);

            try (reader; writer) {
                int data = 0;

                while ((data = reader.read()) != -1) {
                    char c = (char) data;
                    writer.write(c);
                    System.out.print(c);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*try {
            Reader reader = new FileReader(src);
            Writer writer = new FileWriter(des);
            try (reader; writer) {
                char[] chars = new char[50];
                int len = 0;

                while ((len = reader.read(chars)) != -1) {
                    writer.write(chars, 0, len);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }
}
