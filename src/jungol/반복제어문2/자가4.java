package jungol.반복제어문2;

import java.util.Scanner;

public class 자가4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum = 0;

        for(int i = a;i<=100;i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
