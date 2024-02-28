package ch05.sec09;

import java.util.Arrays;

public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] oldStrArray = {"Java", "array", "copy"};
        String[] newStrArray = new String[5];

//        newStrArray = Arrays.copyOf(oldStrArray, oldStrArray.length);
//        System.out.println(Arrays.toString(newStrArray));

        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for (int i = 0; i < newStrArray.length; i++) {
            System.out.print(newStrArray[i] + ", ");
        }
        System.out.println();

        System.out.println(Arrays.toString(newStrArray));
    }
}