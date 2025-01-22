package jungol.반복제어문2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class 형성6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = 0;
        double avg = 0;
        int count = 0;

        if (b >= a) {
            for (int i = a; i <= b; i++) {
                if (i % 3 == 0 || i % 5 == 0) {

                    count++;
                    sum += i;
                    avg = (double) sum / count;
                }
            }
        }

    if(a>b){
        for (int i = b; i <= a; i++) {
            if (i % 3 == 0 || i % 5 == 0) {

                count++;
                sum += i;
                avg = (double) sum / count;
            }
        }
    } System.out.println("sum : "+sum);
        System.out.printf("avg : %.1f",avg);

    }

}




