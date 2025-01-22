package jungol.반복제어문3;

import java.util.Scanner;

public class 자가2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();

        for(int i = 0;i<a;i++){
            for(int j =1;j<=1+i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }}


