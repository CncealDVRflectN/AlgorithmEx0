import java.io.File;
import java.io.FileWriter;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AlgExOne {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("input.txt"));
        FileWriter writer = new FileWriter("output.txt");
        BigInteger number;
        BigInteger sum = new BigInteger("0");
        Set<BigInteger> set = new HashSet<>();
        while(scanner.hasNextBigInteger()){
            number = scanner.nextBigInteger();
            if(set.add(number)){
                sum = sum.add(number);
            }
        }
        writer.write(sum.toString());
        writer.close();
        scanner.close();
    }
}
