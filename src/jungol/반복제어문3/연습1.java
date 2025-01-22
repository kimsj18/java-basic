package jungol.반복제어문3;

import day3.Main;

import java.util.Scanner;

public class 연습1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        int b = 1;
        int count = 0;
        int a = in.nextInt();

        while(sum<a){
            count ++;
            sum += b;
            b++;
        }
        System.out.printf("%d %d",count,sum);
    }
}
