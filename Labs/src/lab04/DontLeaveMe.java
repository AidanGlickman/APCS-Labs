package lab04;
import java.util.Scanner;

public class DontLeaveMe {
    public static void main(String[] args) {
        String userIn;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("What Should I Say?\t");
            userIn = scanner.nextLine();

            if(!(userIn.equalsIgnoreCase("EXIT"))) { //This if statement is necessary to deal with the edge case that they say exit first
                System.out.println(userIn + "\n");
            }
        }while(!(userIn.equalsIgnoreCase("EXIT")));

        System.out.println("Exiting...");
        System.exit(0);
    }
}
