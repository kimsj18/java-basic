package jungol.반복제어문3;

import java.util.Scanner;

public class 형성1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int avg = 0;

        while (count<20){
            int a = in.nextInt();

            if(a==0){
                break;
        } count++ ;
            sum += a;
            avg = sum/count;}
        System.out.printf("%d %d",sum,avg);

//        Scanner sc = new Scanner(System.in);
//        int count = 0;
//        int sum = 0;
//        int avg = 0;
//
//        for(int i = 1 ; i<=20;i++) {
//            int a = sc.nextInt();
//            if (a == 0) break;
//            {
//            }
//            count++;
//            sum += a;
//            avg = sum / count;
//        }
//        System.out.printf("%d %d",sum,avg);
    }
}
