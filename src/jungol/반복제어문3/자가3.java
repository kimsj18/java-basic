package jungol.반복제어문3;

import java.util.Scanner;

public class 자가3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        for(int i = 0; i<a;i++){
            for(int j=0; j<a-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }for(int z=0; z<a;z++){
            for(int b=0;b<=z;b++){
                System.out.print("*");
    } System.out.println();

            }
        }
}
