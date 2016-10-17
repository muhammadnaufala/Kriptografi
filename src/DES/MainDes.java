package DES;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Muhammad Naufal A on 08/10/2016.
 */
public class MainDes {
    public static void main(String[] argv) throws UnsupportedEncodingException {
        String teks = "COMPUTER";
        DesEncrypter encrypter = new DesEncrypter(teks);
        List<String> aa = new ArrayList<String>();
        String bb;
        bb = encrypter.encrypt("COMPUTER","133457799BBCDFF1");
//        bb = encrypter.decrypt("©òêÄ¡_B?","133457799BBCDFF1");
//        bb = "110010110011110110001011000011100001011111110101";
//        aa = encrypter.decrypt("©òêÄ¡_B?","sadsad");
        BigInteger temp = new BigInteger(bb, 2);
        String hex = temp.toString(16);
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < hex.length(); i+=2) {
            String str = hex.substring(i, i+2);
            output.append((char)Integer.parseInt(str, 16));
        }
        //System.out.println(encrypter.Ktemp.get(0));
        System.out.println(bb);
        System.out.println(hex);
        System.out.println(output);
    }
}