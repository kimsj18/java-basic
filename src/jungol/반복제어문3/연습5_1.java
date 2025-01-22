package jungol.반복제어문3;


import java.util.Scanner;

public class 연습5_1 {
    public static void main(String[] args) {
        int a=0;
        for(int i =1;i<=5;i++){
            for(int j=0;j<=4-i;j++){
                System.out.print(" ");
            }for(int z=0;z<i+a;z++){
                System.out.print("*");
            }
            System.out.println();
            a++;
        }

    }
}
