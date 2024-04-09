package KlasesIrNamuDarbas.JavaPraktika.Enigma;

import java.util.Random;

public class Encoder {
    private String plainText;
    private String cypher;

    public String getPlainText() {
        return plainText;
    }

    private char randomChar() {
        Random random = new Random();
        int randomNumber = random.nextInt(26) + 65;
        char randomChar = (char) randomNumber;
        return randomChar;
    }

    public void encode() {
        String encoded = " "
    }


}
