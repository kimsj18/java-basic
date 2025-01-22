package jungol.배열1;

import java.util.Scanner;

public class 자가5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] a = new double[6];
        a[0]= 85.6;
        a[1]= 79.5;
        a[2]= 83.1;
        a[3]= 80.0;
        a[4]= 78.2;
        a[5]= 75.0;

        double sum = 0.0;
        int b = 0;


        for(int i=0;i<2;i++){
            b=input.nextInt();

            sum+=a[b-1];
        }
        System.out.print(sum);

    }
}
