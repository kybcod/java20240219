package ch18.sec11;

import java.io.File;
import java.text.*;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) throws Exception {
        File dir = new File("temp/images");
        File file1 = new File("temp/file1.txt");
        File file2 = new File("temp/file2.txt");
        File file3 = new File("temp/file3.txt");

        if (dir.exists() == false) {
            dir.mkdirs();
        }
        if (file1.exists() == false) {
            file1.createNewFile();
        }
        if (file2.exists() == false) {
            file2.createNewFile();
        }
        if (file3.exists() == false) {
            file3.createNewFile();
        }

        File temp = new File("temp");
        File[] contents = temp.listFiles();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
        for (File file : contents) {
            System.out.printf("%-25s", sdf.format(new Date(file.lastModified())));
            if (file.isDirectory()) {
                System.out.printf("%-10%-TS20s", "<DIR>", file.lastModified());
            } else {
                System.out.printf("%-10%-20s", file.length(), file.getName());
            }
            System.out.println();
        }
    }
}
