package Day5;

import java.util.Scanner;

public class TheGridSearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            int r = s.nextInt();
            int c = s.nextInt();
            int[][] arr_main = new int[r][c];
            String[] str=new String[r];
            for (int j = 0; j < r; j++) {
                str[j]=s.next();

            }
            for (int j = 0; j <r ; j++) {
                for (int k = 0; k <c ; k++) {
                    arr_main[j][k]=Character.getNumericValue(str[j].charAt(k));

                }

            }
            int r1 = s.nextInt();
            int c1 = s.nextInt();
            int[][] arr_find = new int[r1][c1];
            String[] str2=new String[r1];

            for (int j = 0; j < r1; j++) {
               str2[j]=s.next();
            }
            for (int j = 0; j <r1 ; j++) {
                for (int k = 0; k <c1 ; k++) {
                    arr_find[j][k]=Character.getNumericValue(str2[j].charAt(k));


                }

            }

//            for (int j = 0; j <r ; j++) {
//                for (int k = 0; k <c ; k++) {
//                    System.out.println(arr_main[j][k]);
//
//                }
//
//            }
//            System.out.println("no");
//            System.out.println("n0");
//
//            for (int j = 0; j <r1 ; j++) {
//                for (int k = 0; k <c1 ; k++) {
//                    System.out.println(arr_find[j][k]);
//
//                }
//
//            }

            int loc = arr_find[0][0];
//            System.out.println(arr_find[0][0]);
            int flag = 1;

            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {

                    if (arr_main[j][k] != loc) {
                        continue;
                    } else {
                        if (r1 + j <= r && c1 + k <= c) {
                            int counter=0;
                            for (int l = 0; l < r1; l++) {
                                for (int m = 0; m < c1; m++) {
                                    if (arr_find[l][m] == arr_main[l+j][m + k]) {
                                        counter++;
                                        continue;

                                    } else {
//                                        System.out.println(l+j);
//                                        System.out.println(m+k);
//                                        System.out.println("NO");
                                        flag = 0;
                                        break;
                                    }
                                }
                                if(counter==r1*c1){
                                    flag=2;
                                    System.out.println("YES");
                                    break;
                                }


                            }
                            if (flag == 2) {
                                break;
                            }
                        }

                    }
                    if (flag == 2) {
                        break;

                    }
                }
                if (flag == 2) {
                    break;

                }


            }
            if(flag!=2){
                System.out.println("NO");
            }

        }
    }
}

