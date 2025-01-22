package jungol.배열1;

import java.util.Scanner;

public class 연습1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        for(int i =0; i<5;i++){
            a[i]=sc.nextInt();
        }for(int j=0;j<a.length;j++){
            System.out.print(a[j]+" ");
        }



    }
}