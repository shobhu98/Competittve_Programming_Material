package Day5;

import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        StringBuilder s=new StringBuilder();
        String str=scan.nextLine();
//        System.out.println(str);

        s.append(str);
//        System.out.println(s);

        for (int i = 0; i <s.length()-1 ; i++) {
            if(s.charAt(i)==' '){
                s.deleteCharAt(i);


            }

        }
//        System.out.println(s);
        int n=(int)Math.sqrt(s.length());
        System.out.println(n);
        int row=0;
        int column=0;
        if(s.length()<=n*n+1){
//            System.out.println("a");
            row=n;
            column=n;
        }
        else {
//            System.out.println("b");
            row=n+1;
            column=n+1;
        }
//        System.out.println(row);
//        System.out.println(column);
//        System.out.println(s.length());
        char[][] arr=new char[row][column];
        int len=s.length();
        int counter=0;
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <column ; j++) {
                if(counter<len){
                    arr[i][j]=s.charAt(counter);
                    counter++;
                }
                else {
                    arr[i][j]='0';
                    counter++;
                }
            }

        }
//        for (int i = 0; i <row ; i++) {
//            for (int j = 0; j <column ; j++) {
//                System.out.println(arr[i][j]);
//            }
//
//        }
        StringBuilder final_str =new StringBuilder();
        for (int j = 0; j <column ; j++) {
            StringBuilder sx=new StringBuilder();
            for (int i = 0; i <row ; i++) {
                if(arr[i][j]!='0'){
                    sx.append(arr[i][j]);
                }


            }
            final_str.append(sx+" ");

        }
        System.out.println(final_str);





    }
}
