package ch05.Exercise;

public class ex08For {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int arrNum = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                arrNum++;
            }
        }
        double avg = (double) sum / arrNum;
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
