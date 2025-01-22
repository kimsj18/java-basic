package day2;

import java.util.Scanner;

public class FourArithmetic {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = 12;
        int b = 2;
        int result = 0; //처리 결과를 저장하는 변수

        result = a + b;
        System.out.printf("a + b = %d%n",result);
        System.out.println("a + b = " + result);
        result = a - b;
        System.out.printf("a - b = %d%n",result);
        result = a * b;
        System.out.printf("a * b = %d%n",result);
        result = a / b;
        System.out.printf("a / b = %d%n",result);

    }

}

