package jungol.반복제어문3;

import java.util.Scanner;

public class 형성2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum = 0;
        int b = 0;
        // 배수가 100넘으면 바로 끝
        // 10의 배수가 되면 거까지 출력하게끔
        for (int i = 1; i <= 100; i++) {
                sum = a * i;
                if (sum > 100){
                    break;
        }System.out.print(sum + " ");
                if(sum%10==0){
                    break;
            }

            }
        }


    }






