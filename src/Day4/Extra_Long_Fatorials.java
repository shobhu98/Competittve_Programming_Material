package Day4;

import java.math.BigInteger;
import java.util.Scanner;

public class Extra_Long_Fatorials {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
//        int num=s.nextInt();
        BigInteger res=BigInteger.ONE;
        for (int i = 1; i <=t ; i++) {
            res=res.multiply(BigInteger.valueOf(i));

        }
        System.out.println(res);
    }
}
