package jungol.배열1;

import java.util.Scanner;

public class 자가6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[10];
        int min = 1000;

        for(int i=0;i<10;i++){
            a[i]=input.nextInt();
            if(a[i]<=1000){
                if(a[i]<min){
                    min=a[i];
                }
            }

        }System.out.println(min);


    }
}
