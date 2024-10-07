import java.util.Arrays;

public class Aufgabe3 {
    public static void main(String[] args) {
        int[] firstArray = {8, 6, 4, 0, 0, 0, 0, 0};
        int[] secondArray = {3, 2, 9, 0, 0, 0, 0, 0};
        //Unterpunkt 1
        System.out.println(Arrays.toString(bigSum(firstArray, secondArray)));
        //Unterpunkt 2
        System.out.println(Arrays.toString(bigDiff(firstArray, secondArray)));

    }

    public static int[] bigSum(int[] firstArray, int[] secondArray) {
        int carry = 0;
        int[] resultArray = new int[firstArray.length + 1];
        for (int i = firstArray.length - 1; i >= 0; i--) {
            int sum = firstArray[i] + secondArray[i] + carry;
            resultArray[i + 1] = sum % 10;
            carry = sum / 10;
        }


        resultArray[0] = carry;

        if (resultArray[0] == 0) {
            int[] trimmedResult = new int[firstArray.length];
            System.arraycopy(resultArray, 1, trimmedResult, 0, firstArray.length);
            return trimmedResult;
        } else {
            return resultArray;
        }
    }

    public static int[] bigDiff(int[] firstArray, int[] secondArray) {
        int borrow = 0;
        int[] resultArray = new int[firstArray.length];
        for (int i = firstArray.length - 1; i >= 0; i--) {
            int diff = firstArray[i] - secondArray[i] - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            resultArray[i] = diff;
        }
        int leadingZeroCount = 0;
        while (leadingZeroCount < firstArray.length && resultArray[leadingZeroCount] == 0) {
            leadingZeroCount++;
        }

        if (leadingZeroCount == firstArray.length) {
            return new int[] {0};
        }

        int[] trimmedResult = new int[firstArray.length - leadingZeroCount];
        System.arraycopy(resultArray, leadingZeroCount, trimmedResult, 0, firstArray.length - leadingZeroCount);

        return trimmedResult;
    }
}
