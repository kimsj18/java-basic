package jungol.반복제어문3;

import java.util.Scanner;

public class 자가6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char b = 'A';

        if (1 <= a && a <= 6) {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a-i; j++) {
                    System.out.print(b++);
                }
                System.out.println();
            }
        }

    }
}