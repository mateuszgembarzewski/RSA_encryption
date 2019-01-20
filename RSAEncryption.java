import java.util.Random;
import java.math.BigInteger;

public class RSAEncryption {

    public static void main(String args[]) {

        BigInteger p = new BigInteger("885320963");
        BigInteger q = new BigInteger("238855417");
        BigInteger e = new BigInteger("9007");
        BigInteger n = q.multiply(p);

        // n = (p-1) * (q-1)
        BigInteger ION = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));

        BigInteger d = e.modInverse(ION);

        BigInteger plaintxt = new BigInteger("30120");
        BigInteger encrypt = plaintxt.modPow(e,n);
        BigInteger decrypt = encrypt.modPow(d,n);
        System.out.println("Alice encrypts:" + plaintxt);
        System.out.println("Alice sends:" + encrypt);
        System.out.println("Bob Computes:" + d);
        System.out.println("Bob decrypts:" + decrypt);
    }
}


