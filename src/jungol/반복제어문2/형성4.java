package jungol.반복제어문2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class 형성4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum=0;
        double avg = 0;

        for(int i =1;i<= a;i++){
            int b = in.nextInt();
            sum += b;
            }
        avg = (double) sum/a;
        System.out.printf("%.2f",avg);

    }


}
