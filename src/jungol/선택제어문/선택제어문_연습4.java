package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("점수를 입력하세요. ");
        int a = input.nextInt();

        if(a > 89){
            System.out.println("A");
        }else if(a > 79){
            System.out.println("B");
        }else if(a > 69){
            System.out.println("C");
        }else if(a >59){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
}
