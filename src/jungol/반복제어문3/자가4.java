package jungol.반복제어문3;

import java.util.Scanner;

public class 자가4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        for(int i =0 ; i<a;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }for(int z=1;z<=a-i;z++){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
