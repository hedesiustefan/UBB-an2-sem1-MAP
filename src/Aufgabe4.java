public class Aufgabe4 {
    public static void main(String[] args) {
        int[] keyboards = {5, 15, 20, 35, 50, 65, 40};
        int[] drives = {10, 75, 80, 30, 25, 10, 60};
        //unterpunkt 1
        System.out.println("Most cheap keyboard is: " + cheapestKeyboard(keyboards));
        //Unterpunkt 2
        System.out.println("Most expensive thing is: " + mostExpensiveThing(keyboards, drives));

    }

    public static int cheapestKeyboard(int[] keyboards) {
        int minPrice = Integer.MAX_VALUE;
        for (int keyboard : keyboards) {
            if (keyboard < minPrice) {
                minPrice = keyboard;
            }
        }
        return minPrice;
    }

    public static int mostExpensiveThing(int[] keyboards, int[] drives) {
        int maxPrice = Integer.MIN_VALUE;
        for (int keyboard : keyboards) {
            if (keyboard > maxPrice) {
                maxPrice = keyboard;
            }
        }
        for (int drive : drives) {
            if (drive > maxPrice) {
                maxPrice = drive;
            }
        }
        return maxPrice;
    }

}
