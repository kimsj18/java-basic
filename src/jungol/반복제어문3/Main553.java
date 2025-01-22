package jungol.반복제어문3;

import java.util.Scanner;

public class Main553 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        char ch = 'A';

        for(int i = 0;i<a;i++) {
            for (int j = 0; j < a - i; j++) {
                //ch++;
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}
