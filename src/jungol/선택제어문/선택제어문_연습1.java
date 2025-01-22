package jungol;


import java.util.Scanner;

public class 선택제어문_연습1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        System.out.println(a);
        if (a > 10) {
            System.out.println("10보다 큰 수를 입력하셨습니다.");
        }
    }
}

