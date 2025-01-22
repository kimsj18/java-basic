package jungol.반복제어문1;

import java.util.Scanner;

public class 연습4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        double avg = 0;

        while(true){
            int a = input.nextInt();

            if(a == 0){
                break;
            }else{
                count ++;
                sum += a;
                avg = (double) sum/count;
            }
        }
        System.out.println("입력된 자료의 개수 = " + count);
        System.out.println("입력된 자료의 합계 = " + sum);
        System.out.printf("입력된 자료의 평균 = " + "%.2f",avg);
    }
}
