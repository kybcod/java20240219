package ch03.exercise;

public class Exercise03 {
    public static void main(String[] args) {
        int pencils = 534;
        int students = 30;

        int pecilsPerStudent = pencils / students;
        System.out.println("pecilsPerStudent = " + pecilsPerStudent);

        int pecilsLeft = pencils % students;
        System.out.println("pecilsLeft = " + pecilsLeft);

    }
}
