package jungol.반복제어문2;

import java.util.Scanner;

public class 연습6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        double avg = 0;
        int count = 0;

        while (true){
            int a = in.nextInt();
            count++ ;
            sum += a;
            avg=(double) sum/count;
            if(count==5)
            break;
        }
        System.out.println("총점 : "+sum);
        System.out.printf("평균 : "+"%.1f",avg);
    }

}
