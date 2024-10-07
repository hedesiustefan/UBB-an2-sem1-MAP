import java.util.Arrays;

public class Aufgabe1 {
    public static void main(String[] args) {
        //Unterpunkt 1
        System.out.println(Arrays.toString(failingGrades(new int[]{37, 39, 89, 12, 75})));
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
}
