package lab01;
import java.util.Scanner;

public class RepeatRepeatParrot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String printme;
        int metimes;

        System.out.print("What should I say?    ");
        printme = scanner.nextLine();

        System.out.print("How many times should I say it?   ");
        metimes = scanner.nextInt();

        for(int i=0; i<metimes; i++){
            System.out.println(printme);
        }
    }
}
