package ch18.lecture.p2inputSream;

import java.io.*;

public class C05CopyFile {
    public static void main(String[] args) throws FileNotFoundException {
        String inputFileName = "temp/output9.data";
        String outputFileName = "temp/output9.copy";


        try {
            InputStream is = new FileInputStream(inputFileName);
            OutputStream os = new FileOutputStream(outputFileName);

            // close 하기 위해 작성된 try
            try (is; os;) {
                byte[] data = new byte[10];
                int len = 0;
                while ((len = is.read(data)) != -1) {
                    os.write(data, 0, len);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
