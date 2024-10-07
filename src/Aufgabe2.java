public class Aufgabe2 {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 78, 36, 59, 23, 81, 7, 50, 91, 14, 67, 88, 32, 3, 62, 19, 96, 27, 41};
        //Unterpunkt 1
        System.out.println(maxNumber(numbers));
    }

    public static int maxNumber(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }
}
