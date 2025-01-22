package jungol;

import java.util.Scanner;

public class 반복제어문3_자가4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <num-i ; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
