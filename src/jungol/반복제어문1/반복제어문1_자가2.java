package jungol;

import java.util.Scanner;

public class 반복제어문1_자가2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int sum = 0;

        do {
            sum += a;
            a--;
            } while (a>=1);
        System.out.println(sum);
    }
}
