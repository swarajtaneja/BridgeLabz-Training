import java.util.Random;

public class StudentGradeSystemString {

    static int[][] generateScores(int students) {
        Random r = new Random();
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 10 + r.nextInt(90);
            }
        }
        return scores;
    }

    static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            avg = Math.round(avg * 100.0) / 100.0;
            percent = Math.round(percent * 100.0) / 100.0;
            results[i][0] = total;
            results[i][1] = avg;
            results[i][2] = percent;
        }
        return results;
    }

    static char[] calculateGrades(double[][] results) {
        char[] grades = new char[results.length];
        for (int i = 0; i < results.length; i++) {
            double p = results[i][2];
            if (p >= 80) grades[i] = 'A';
            else if (p >= 70) grades[i] = 'B';
            else if (p >= 60) grades[i] = 'C';
            else if (p >= 50) grades[i] = 'D';
            else if (p >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }
        return grades;
    }

    static void displayScorecard(int[][] scores, double[][] results, char[] grades) {
        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAvg\tPercent\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                scores[i][0] + "\t" +
                scores[i][1] + "\t" +
                scores[i][2] + "\t" +
                (int) results[i][0] + "\t" +
                results[i][1] + "\t" +
                results[i][2] + "\t\t" +
                grades[i]
            );
        }
    }

    public static void main(String[] args) {
        int students = 5;
        int[][] scores = generateScores(students);
        double[][] results = calculateResults(scores);
        char[] grades = calculateGrades(results);
        displayScorecard(scores, results, grades);
    }
}