package jungol.배열1;

import java.util.Scanner;

public class 연습6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[10];
        int max = a[0];

        for(int i=0;i<10;i++){
            a[i]=input.nextInt();
            if(a[i]>max){
                max =a[i];
            }
        }
        System.out.println(max);
    }
}
