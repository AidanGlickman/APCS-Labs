package lab01;
import java.io.*;
import java.util.Scanner;
public class Challenge {
    public static void main(String[] args) {
        Scanner userin = new Scanner(System.in);
        BufferedReader br = null;

        System.out.println("Where is your file?");
        //C:\Users\aidan\Dropbox\0. APCS\lab 0001\CSLab01ABC.txt
        String filepath = userin.nextLine();

        String[] a = new String[5];
        String[] b = new String[5];
        String[] c = new String[5];
        String[] inputs = new String[4];
        String[] outputs = {"","","","",""};

        System.out.println("Give a letter: ");
        inputs[0] = userin.nextLine().toUpperCase();
        System.out.println("Give a letter: ");
        inputs[1] = userin.nextLine().toUpperCase();
        System.out.println("Give a letter: ");
        inputs[2] = userin.nextLine().toUpperCase();
        System.out.println("Give a letter: ");
        inputs[3] = userin.nextLine().toUpperCase();

        try{
            br = new BufferedReader(new FileReader(filepath));

            for(int i = 0; i<15; i++) {
                if(i<5){
                    a[i] = br.readLine();
                }
                else if(i<10){
                    b[i-5] = br.readLine();
                }
                else{
                    c[i-10] = br.readLine();
                }
            }

            for(int i = 0; i<inputs.length; i++){
                for(int k=0; k<outputs.length; k++){
                    switch(inputs[i]){
                        case "A":
                            outputs[k] = outputs[k] + a[k] + " ";
                            break;
                        case "B":
                            outputs[k] = outputs[k] + b[k] + " ";
                            break;
                        case "C":
                            outputs[k] = outputs[k] + c[k] + " ";
                            break;

                    }
                }
            }

            for(int i = 0; i<outputs.length; i++){
                System.out.println(outputs[i]);
            }



        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
