package jungol.선택제어문;

import java.io.OutputStream;
import java.util.Scanner;

public class 형성3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        if(a%400==0) {
            System.out.println("leap year");
        }else if(a%4==0 && a%100!=0) {
            System.out.println("leap year");
        }else{
            System.out.println("common year");

        }
    }
}
