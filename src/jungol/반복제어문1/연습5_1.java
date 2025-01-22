package jungol.반복제어문1;

import java.util.Scanner;

public class 연습5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int avg = 0;

        while(true){
            int a = input.nextInt();

            if(a == 0){
                break;
            }else if(a%2==1){
                count ++;
                sum += a;
                avg = sum/count;
            }
        }
        System.out.println("홀수의 합 = "+sum);
        System.out.println("홀수의 평균 = "+avg);
    }
}


