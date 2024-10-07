import java.util.Arrays;

public class Aufgabe1 {
    public static void main(String[] args) {
        int[] grades = {37, 39, 89, 12, 75};
        //Unterpunkt 1
        System.out.println(Arrays.toString(failingGrades(grades)));
        //UNterpunkt2
        System.out.println(gradeAverage(grades));
    }

    public static int[] failingGrades(int[] grades) {
        int idx = 0;
        for (int i = 0; i < grades.length; i++) {
            if(grades[i] < 38) {
                idx++;
            }
        }

        int[] failingGrades = new int[idx];
        int failingIdx = 0;
        for (int grade : grades) {
            if (grade < 38) {
                failingGrades[failingIdx] = grade;
                failingIdx++;
            }
        }
        return failingGrades;
    }

    public static int gradeAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
}
