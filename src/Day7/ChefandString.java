package Day7;

import java.util.Scanner;

public class ChefandString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int i = 0; i <t ; i++) {
            String str=s.next();
            int pair=0;
            for (int j = 0; j <str.length()-1 ; j++) {
                if(str.charAt(j)!=str.charAt(j+1)){
                    pair++;
                    j=j+1;
                }


            }
            System.out.println(pair);

        }
    }
}
