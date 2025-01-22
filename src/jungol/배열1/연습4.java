package jungol.배열1;

import java.util.Scanner;

public class 연습4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[99];
        int count = 0;

        for(int i=0;i<100;i++){
            a[i] = input.nextInt();
            if(a[i]==0){break;}
            count ++;
        }for(int j=1;j<count;j+=2){
            System.out.print(a[j]+" ");
        }

    }
}
