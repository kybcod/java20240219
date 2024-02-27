package ch05.lecture.p1array;

public class C07Array {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 10, 8, -1, 0, 9, 45, 23, 11};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //향상된 for문
        System.out.println("----------------------");
        for (int item : arr) {
            System.out.println(item);
        }
    }
}
