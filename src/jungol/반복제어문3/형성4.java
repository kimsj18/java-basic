package jungol.반복제어문3;

import java.util.Scanner;

public class 형성4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for(int i=a; i>=1;i--){
            for(int j=0; j<=(a-i)-1;j++){
                System.out.print(" ");
           }for(int j=0; j<(i*2-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<a-1;i++){
            for(int j=0;j<=(a-i-1);j++){
                System.out.print(" ");
            }for(int j=0;j<a+(i*2);j++){
                System.out.print("*");
            }System.out.println();
        }




    }
}

