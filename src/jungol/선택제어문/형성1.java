package jungol.선택제어문;

import java.util.Scanner;

public class 형성1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if(a>b){
            System.out.println(a-b);
        }else if(b>a){
            System.out.println(b-a);
        }
    }
}
