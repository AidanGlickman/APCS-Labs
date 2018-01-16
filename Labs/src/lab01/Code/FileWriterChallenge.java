package lab01.Code;
import java.io.*;
import java.util.Scanner;
public class FileWriterChallenge {
    public static void main(String[] args) {
        Scanner userin = new Scanner(System.in);
        BufferedReader br = null;

        System.out.println("Where is your file?");
        //C:\Users\aidan\Dropbox\0. APCS\lab 0001\CSLab01ABC.txt
        String filepath = userin.nextLine();

        System.out.println("Where would you like to write the file?");
        String outpath = userin.nextLine();

        final int numLines = 5;
        final int inOut = 4;
        String[] a = new String[numLines];
        String[] b = new String[numLines];
        String[] c = new String[numLines];
        String[] inputs = new String[inOut];
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

            for(int i = 0; i<3*numLines; i++) { //since there are three
                if(i<numLines){
                    a[i] = br.readLine();
                }
                else if(i<2*numLines){
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




        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        try {

            File file = new File(outpath);

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            for(int i = 0; i<outputs.length; i++){
                bw.write(outputs[i] + "\n");
            }
            System.out.println("File Written!");

            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
