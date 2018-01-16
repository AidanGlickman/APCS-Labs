package lab04.Code;

public class EncryptionV2 {

    final int ASCIISTART = 32;
    final int LETTERCOUNT = 95;

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
