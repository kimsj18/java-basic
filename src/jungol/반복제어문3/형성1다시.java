package jungol.반복제어문3;

import java.util.Scanner;

public class 형성1다시 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;


        for(int i =0;i<20;i++){
            int a = sc.nextInt();

            if(a==0) {
                break;

            }count ++;
            sum += a;



            }System.out.printf("%d %d",sum,sum/count);

    }
    }

