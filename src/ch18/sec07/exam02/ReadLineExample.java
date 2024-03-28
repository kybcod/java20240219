package ch18.sec07.exam02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineExample {
    public static void main(String[] args) throws Exception {
        String file = "src/ch18/lecture/p5filter/C07BufferedReader.java";
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        int line = 1;

        while (true) {
            String str = br.readLine();
            if (str == null) break;
            System.out.println(line + "\t" + str);
            line++;
        }
        br.close();


    }
}
