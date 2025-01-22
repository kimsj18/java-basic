package jungol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_자가4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double avg = 0.0;

        while(true){
            int a = in.nextInt(); //100이상의 수가 나오기 전까지의 입력된 수를 저장
            count ++;
            sum +=a;
            avg = (double) sum/count;
            if(a>=100){
                break;
            }

        }
        System.out.println(sum);
        System.out.printf("%.1f",avg);   //소수2번째자리에서 반올림한 후 , 소수 첫째자리까지 출력
    }
}
