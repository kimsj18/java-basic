package jungol.배열1;

import java.util.Scanner;

public class 자가4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[100];
        int count = 0;

        for(int i=0;i<100;i++){
            a[i]=input.nextInt();
            if(a[i]==0){break;}
            count++;
        }for(int j=count-1;j>=0;j--){
            System.out.print(a[j]+" ");
        }

    }
}
