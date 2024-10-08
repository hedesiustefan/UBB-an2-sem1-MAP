public class Aufgabe4 {
    public static void main(String[] args) {
        int[] keyboards = {5, 15, 20, 35, 50, 65, 40};
        int[] drives = {10, 75, 80, 30, 25, 10, 60};
        //unterpunkt 1
        System.out.println("Most cheap keyboard is: " + cheapestKeyboard(keyboards));

    }

    public static int cheapestKeyboard(int[] keyboards) {
        int minPrice = 1000000;
        for (int keyboard : keyboards) {
            if (keyboard < minPrice) {
                minPrice = keyboard;
            }
        }
        return minPrice;
    }

}
