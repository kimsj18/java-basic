package jungol.반복제어문2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class 자가5 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        int threeCount = 0; //3의 배수의 개수
        int fiveCount = 0; //5의 배수의 개수
        int inputCount = 0; // 10개의 정수 입력 카운트

        while (true) {
            int a = in.nextInt();
            inputCount++;

            if (a % 3 == 0) threeCount++;
            if (a % 5 == 0) fiveCount++;
            if (inputCount == 10) break;
        }
        System.out.printf("Multiples of 3 : %d\n",threeCount);
        System.out.printf("Multiples of 5 : %d\n",fiveCount);
    }
}