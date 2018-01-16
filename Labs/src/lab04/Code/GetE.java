package lab04.Code;

public class GetE {
    public static void main(String[] args) {
       int userIn = Integer.parseInt(args[0]);
       double euler = 1; //we begin at 1 because the first thing added is always 1 regardless
       int factorial = 1;

       for(int i = 1; i<userIn; i++){
           factorial *= i;
           euler += 1.0/(factorial);
       }

        System.out.println(euler);
    }
}
