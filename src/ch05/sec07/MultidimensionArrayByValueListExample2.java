package ch05.sec07;

public class MultidimensionArrayByValueListExample2 {
    public static void main(String[] args) {
        int[][] scores = {
                {80, 90, 96},
                {76, 88}
        };

        //첫번째 반의 평균 점수
        int sum1 = 0;
        for (int score : scores[0]) {
            sum1 += score;
        }
        double avg1 = (double) sum1 / scores[0].length;
        System.out.println("avg1 = " + avg1);

        int sumAll = 0;
        int numOfStudent = 0;
        for (int[] classScores : scores) {
            numOfStudent += classScores.length;
            for (int score : classScores) {
                sumAll += score;
            }
        }
        double avgAll = (double) sumAll / numOfStudent;
        System.out.println("avgAll = " + avgAll);
    }
}
