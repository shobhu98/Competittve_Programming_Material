package Day3;

import java.util.ArrayList;
import java.util.Scanner;

public class Simple_Input {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList arrayList=new ArrayList();
        int sum=0;
        while (sum>=0){
            int n=s.nextInt();
            sum+=n;
            if(sum>=0){
                arrayList.add(n);
            }
            else {
                break;
            }

        }
        for (int i = 0; i <arrayList.size() ; i++) {
            System.out.println(arrayList.get(i));

        }
    }
}
