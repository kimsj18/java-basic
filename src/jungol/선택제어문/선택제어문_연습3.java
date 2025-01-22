package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        if(80 <= a){
            System.out.println("점수를 입력하세요. 축하합니다. 합격입니다.");
        }else{
            System.out.println("점수를 입력하세요. 죄송합니다. 불합격입니다.");
        }
    }
}
