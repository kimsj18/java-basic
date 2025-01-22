package jungol.반복제어문3;

import java.util.Scanner;

public class 연습4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        for(int i =1;i<=a;i++){
            for(int j =1;j<=a-i;j++){
                System.out.print(" ");
            }for(int z =1;z<=i;z++){
                System.out.print("*");
            }System.out.println();
        }

    }
}
