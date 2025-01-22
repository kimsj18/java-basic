package jungol.정리;

import java.util.Scanner;

public class 반복제어문3_자가2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();    //행의수

        for(int i = 0; i < num ; i++ ){
            for(int j = 0;j <=i;j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
