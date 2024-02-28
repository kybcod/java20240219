package ch05.Exercise;

public class ex08ForEach {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int arrNum = 0;
        double sum = 0.0;
        for (int[] arr : array) {
            for (int a : arr) {
                sum += a;
                arrNum++;
            }
        }
        System.out.println("sum = " + sum);
        System.out.println("avg = " + sum / arrNum);
    }
}
