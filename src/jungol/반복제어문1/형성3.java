package jungol.반복제어문1;

import java.util.Scanner;

public class 형성3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double avg = 0;

        while (true){
            int a = in.nextInt();

            if(a>100 || a<0){
                break;
            }else{
                sum += a;
                count ++;
                avg = (double) sum/count;
            }
        }
        System.out.println("sum : "+sum);
        System.out.printf("avg : "+"%.1f",avg);
    }
}
