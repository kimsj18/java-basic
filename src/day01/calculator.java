package day01;

import java.util.Scanner;

public class calculator {
        //1 + 1 =?
    public static void main(String[] args) {
        //1. 데이터 자유 jungol.입력\
        Scanner in = new Scanner(System.in);
        System.out.println("first number input: ");
            int a = in.nextInt();  //1
            System.out.println("emd number input: ");
            int b = in.nextInt();  //100
            int sum = 0;
        //2. 데이터 처리

        //3. 데이터 결과 저장
        for (int i = 1; i <= 100; i++) {
            System.out.println("i = " + i);
            if(i % 2 == 0){
            sum = sum + i;}
            System.out.println(+ sum);

            //for문을 이용하여 1-100까지의 합을 구하는 결과 출력
        }
        //4. 결과 출력

        System.out.println("결과값 => " + a + "+" + b + " = " + sum );

    }
}
