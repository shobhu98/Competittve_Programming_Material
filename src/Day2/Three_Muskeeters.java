package Day2;

import java.util.Scanner;

public class Three_Muskeeters {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int athos=0;
        int porthos=0;
        int armis=0;
        int t=s.nextInt();
        t=t-1;
        if(t>=26){
            int a=t/26;
            for (int i = 0; i <a ; i++) {
                athos=a*2;

            }
            int l=t-26*a;
//            System.out.println(l);
            if(l<2){
                athos=athos;
                porthos=0;
                armis=0;
            }
          else  if(l>=2&&l<=10){
                porthos=athos;
                athos=0;
                armis=0;
            }
           else {
                armis=athos;
                porthos=0;
                athos=0;
            }

            System.out.println(athos+" "+porthos+" "+armis);


        } else {
//            System.out.println("aa");
            if(t<2){
                System.out.println(1+" "+ 0+" "+ 0);
            }
          if(t>=2&&t<=10){
                System.out.println(0+" "+1+" "+0);
            }
          else {
                System.out.println(0+" "+1+" "+0);
            }

        }
    }
}
