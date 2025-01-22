package day5;

import java.util.Scanner;

public class WhileEx01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 1;
        while(choice == 1){
            int a;
            System.out.println("숫자를 입력하세요.");
            a = input.nextInt();

            if(a % 2==0){
                System.out.println("짝수입니다.");
            }else{
                System.out.println("홀수입니다.");
            }
            System.out.println("계속하고 싶다면 예1, 아니면 0을 입력하세요.");
            choice = input.nextInt();
        }
        System.out.println("프로그램 종료");
    }
}
/*
        Scanner input = new Scanner(System.in);
        int choice = 1;
        while(true){
            int a;
            System.out.println("숫자를 입력하세요.");
            a = input.nextInt();

            if(a % 2==0){
                System.out.println("짝수입니다.");
            }else{
                System.out.println("홀수입니다.");
            }
            System.out.println("계속하고 싶다면 예1, 아니면 0을 입력하세요.");
            choice = input.nextInt();
            if(choice == 0) break;

        }
        System.out.println("프로그램 종료");*/
