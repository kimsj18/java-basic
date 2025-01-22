package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("1. 삽입");
        System.out.println("2. 수정");
        System.out.println("3. 삭제");
        if(a == 1){
            System.out.println("숫자를 선택하세요. 삽입을 선택하셨습니다.");
        }else if(a == 2){
            System.out.println("숫자를 선택하세요. 수정을 선택하셨습니다.");
        }else if(a == 3){
            System.out.println("숫자를 선택하세요. 삭제을 선택하셨습니다.");
        }
    }
}
