public class Aufgabe4 {
    public static void main(String[] args) {
        int[] keyboards = {5, 15, 20, 35, 50, 65, 40};
        int[] drives = {10, 75, 80, 30, 25, 10, 60};
        //unterpunkt 1
        System.out.println("Most expensive keyboard is: " + cheapestKeyboard(keyboards));

    }

    public static int cheapestKeyboard(int[] keyboards){
        int maxPrice = 0;
        for (int keyboard : keyboards) {
            if (keyboard > maxPrice) {
                maxPrice = keyboard;
            }
        }
        return maxPrice;
    }
}
