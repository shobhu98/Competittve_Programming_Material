package Day7;


import java.util.Scanner;

class TomandJerry2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int i = 0; i <t ; i++) {
            long JS=0L;
         long TS=s.nextLong();
            if(TS%2==1){
                System.out.println(TS/2);
            }
//
            else {
                long xx=TS;
                long r=0;
                int flag=1;
                while (xx>4){
                    xx=xx/2;
                    r=xx%2;
                    if(r%2!=0){
                        System.out.println(xx/2);
                        flag=0;
                        break;
                    }



                }
                if(flag==1){
                    System.out.println(0);
                }




            }




        }


    }
}
