 package Day7;

import java.util.Scanner;

class TomandJerrygame {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int i = 0; i <t ; i++) {
           long JS=0;
         long j=1;
            long TS=i+1;
//            if(TS>999999){
//                int count=0;
//                long ss=TS;
//                while (ss!=0){
//                    count++;
//                    ss=ss/10;
//                }
//               int l=1;
//                for (int k = 0; k <count-1 ; k++) {
//                    if (k == 0) {
//                        JS = JS + 4;
//                        j=j*10;
//
//                    } else {
//                        JS += 45 * l;
//                        l = l * 10;
//                        j = j * 10;
//
//                    }
//
//                }
//            }
//            System.out.println(JS);
//            System.out.println(j);

            for (long r = 1; r <TS ; r++) {
                if(TS%2==1&&r%2==0){
                    JS++;

                }
                else if(TS%2==0&&r%2==0){
                    TS=TS/2;
                    r=r/2;

                }

            }
            System.out.println(JS);


        }

    }
}
