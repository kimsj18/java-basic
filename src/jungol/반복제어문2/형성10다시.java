package jungol.반복제어문2;

import java.util.Scanner;

public class 형성10다시 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if (a >= b) {
            for (int i = 1; i <= 9 ; i++) {
                for (int j = a; j >= b; j--) {
                    System.out.printf("%d * %d = %2d   ", j, i, i * j);

                }
                System.out.println();

            }
        }if(b>a){
            for(int i = 1; i <= 9 ; i++) {
                for (int j = a; j <= b; j++) {
                    System.out.printf("%d * %d = %2d   ", j, i, i * j);

                }
                System.out.println();
        }
    }
}}