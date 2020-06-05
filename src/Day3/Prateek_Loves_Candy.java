package Day3;


import java.util.Scanner;


public class Prateek_Loves_Candy {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        for (int i = 0; i <n ; i++) {
            int a=s.nextInt();
            int x=0;
            int y = 0;
            for (int j = 2; j <1000000 ; j++) {

                boolean flag=true;
//                System.out.println(y+"y is this");
                for (int k = 2; k <=Math.sqrt(j) ; k++) {
                         if(j%k==0){
                             flag=false;
                             break;
                         }
                }
                if(flag){
//
                    x++;
                    y=j;
//                    System.out.println(y);
                }
                if(x==a){
                    System.out.println(y);
                    break;
                }

            }

        }
    }



}
