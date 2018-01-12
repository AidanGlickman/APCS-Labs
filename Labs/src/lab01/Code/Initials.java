package lab01;
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String asciime;
        asciime = "\t\ta\t\tttttttttt\tggggggggg\n" +
                "\t   a a\t\t\tt\t\tg\n" +
                "\t  aaaaa\t\t\tt\t\tg\t   ggg\n" +
                "\t a\t   a\t\tt\t\tg       g\n" +
                "\ta\t    a\t\tt\t\tggggggggg";

        char a;
        char t;
        char g;

        System.out.println("What is the first letter you want?");
        a = scanner.next().charAt(0);

        System.out.println("What is the second letter you want?");
        t = scanner.next().charAt(0);

        System.out.println("What is the third letter you want?");
        g = scanner.next().charAt(0);

        char[] asciichars = asciime.toCharArray();
        for(int i = 0; i<asciichars.length; i++){
            if(asciichars[i]=='a'){
                asciichars[i] = a;
            }

            else if(asciichars[i]=='t'){
                asciichars[i] = t;
            }

            else if(asciichars[i]=='g'){
                asciichars[i] = g;
            }
        }
        String outme = new String(asciichars);
        System.out.println(outme);
    }
}
