package jungol;

import java.util.Scanner;

public class 선택제어문_연습9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if(a >b){
            System.out.println(a);
        }else{
            System.out.println(b);
        }
    }
}
