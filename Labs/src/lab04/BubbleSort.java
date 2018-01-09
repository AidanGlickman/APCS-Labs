package lab04;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int temp;

        System.out.println("Enter a length.");
        int length = scanner.nextInt();

        int[] array = new int[length];

        for(int i = 0; i<length; i++){
            array[i] = random.nextInt(3) + 1;
        }

        System.out.println("Randomly Generated Array: " + Arrays.toString(array));

        for(int i = 1; i < length; i++){
            if (array[i] < array[i - 1]){
                temp = array[i] + array[i-1];
                array[i-1] = temp - array[i-1];
                array[i] = temp - array[i-1];
                i = 0;
            }
        }
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
