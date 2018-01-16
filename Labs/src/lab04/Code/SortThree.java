package lab04.Code;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortThree {
    public static void main(String[] args) {

        final int TOPBOUND = 3;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Enter a length.");
        int length = scanner.nextInt();

        int[] array = new int[length];

        for(int i = 0; i<length; i++){
            array[i] = random.nextInt(TOPBOUND) + 1;
        }

        System.out.println("Randomly Generated Array: " + Arrays.toString(array));

        int oneCount = 0;
        int threeCount = 0;

        int[] newArr = new int[length];
        Arrays.fill(newArr, 2);

        for(int i = 0; i < length; i++) {
            if(array[i] == 1)
                newArr[oneCount++] = 1;
            else if(array[i] == 3)
                newArr[length-threeCount++-1] = 3;
        }

        System.out.println("Sorted Array: " + Arrays.toString(newArr));
    }
}
