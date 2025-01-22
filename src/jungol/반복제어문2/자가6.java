package jungol.반복제어문2;
//과목의 수는 10과목 이하이다.
//변수(과목개수 n, total , avg)
//평균 80점 이상 패스, 80점이하 페일
//출력조건: 평균은 반올림하여 소수 첫째자리까지

import java.util.Scanner;

public class 자가6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();   //과목 수
        int total = 0;
        int count = 0;
        double avg = 0.0;

        for(int i = 0; i <n;i++){
            count ++;
            int num1 = in.nextInt();
            total += num1;
        }
        avg = (double) total/count;
        if(avg >=80){
            System.out.printf("avg : %.1f%n",avg);
            System.out.println("pass");
        }else{
            System.out.printf("avg : %.1f%n",avg);
            System.out.println("fail");
        }
    }
}
