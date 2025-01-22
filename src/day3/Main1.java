package day3;

import day2.Operator;

import java.util.Scanner;


public class Main1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("첫번째 숫자 jungol.입력 :");
        int num1 = input.nextInt();
        System.out.println(num1);

        System.out.println("두번째 숫자 jungol.입력 :");
        int num2 = input.nextInt();
        System.out.println(num2);

        System.out.println("산술연산 +,-,*,/ 중 선택하세요.");

        char operator = input.next().charAt(0);

        if (operator == '+') {
           int value = adder(num1, num2);
            System.out.println(value);
        }
        if (operator == '-') {
            minus(num1, num2);
        }
        if (operator == '*') {
            multi(num1, num2);
        }
        if (operator == '/') {
            div(num1, num2);
        }
    }
        static int adder(int n1,int n2){
            int result = n1 + n2;
            System.out.printf("결과 : %d + %d = %d%n",n1,n2,result);
            return result;
        }

        static void minus(int n1,int n2){
            int result = n1 - n2;
            System.out.printf("결과 : %d - %d = %d%n",n1,n2,result);
        }
        static void multi(int n1,int n2){
            int result = n1 * n2;
            System.out.printf("결과 : %d * %d = %d%n",n1,n2,result);
        }
        static void div(int n1,int n2){
            int result = n1 / n2;
            System.out.printf("결과 : %d / %d = %d%n",n1,n2,result);
        }
}
