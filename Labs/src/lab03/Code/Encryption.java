package lab03.Code;

public class Encryption {

    final int ASCIISTART = 65;
    final int LETTERCOUNT = 26;

    public static void main(String[] args) {
        Encryption e = new Encryption();
        System.out.println(e.encrypt(9, "PROGRAMS"));
        System.out.println(e.decrypt(1,"ABCEYJPG"));
    }

    public String encrypt(int key, String text){
        char[] toEncrypt = text.toCharArray();
        char[] encrypted = new char[toEncrypt.length];
        int newKey = key;

        for(int i = 0; i < toEncrypt.length; i++){
            encrypted[i] = (char)(((toEncrypt[i] + newKey - ASCIISTART) % LETTERCOUNT) + ASCIISTART);
            newKey += toEncrypt[i];
        }
        return new String(encrypted);
    }

    public String decrypt(int key, String text){
        char[] toDecrypt = text.toCharArray();
        char[] decrypted = new char[toDecrypt.length];
        int newKey = key;

        for(int i = 0; i < toDecrypt.length; i++){
            decrypted[i] = (char)((((toDecrypt[i] - newKey - ASCIISTART) % LETTERCOUNT + LETTERCOUNT) % LETTERCOUNT) + ASCIISTART);
            newKey += decrypted[i];
        }

        return new String(decrypted);
    }
}
