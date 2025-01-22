package jungol.반복제어문1;

import java.util.Scanner;

public class 반복제어문_연습3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.print("점수를 입력하세요. ");
            int a = input.nextInt();
            if(100 < a || a < 0){
                break;
            }
            if (100 >= a && a >= 80) {
                System.out.println("축하합니다. 합격입니다.\n");
            } else if (79 > a && a >= 0) {
                System.out.println("죄송합니다. 불합격입니다.\n");
            } else {

            }
        }
    }
}