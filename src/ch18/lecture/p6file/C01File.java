package ch18.lecture.p6file;

import java.io.File;

public class C01File {
    public static void main(String[] args) {

        String path = "src/ch18/lecture/p6file/C01File.java";
        File file = new File(path);

        long size = file.length();
        System.out.println("size = " + size + "byte");

        boolean exists = file.exists();
        System.out.println("exists = " + exists);

        boolean directory = file.isDirectory();
        System.out.println("directory = " + directory);

        File absoluteFile = file.getAbsoluteFile();
        System.out.println("absoluteFile = " + absoluteFile);

        String parent = file.getParent();
        System.out.println("parent = " + parent);

        
    }
}
