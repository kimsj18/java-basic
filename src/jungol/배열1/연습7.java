package jungol.배열1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class 연습7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            int n = input.nextInt();
            a[i]=n;

        }
        int maxValue = -2147483648;
        int minValue = 2147483647;

        for(int i = 0;i<a.length;i++){
            if(a[i]%2==0){
                if(maxValue<a[i]){
                    maxValue=a[i];
                }

            }else{
                if(minValue>a[i]){
                    minValue = a[i];
                }
            }
        }
        System.out.println(minValue+" "+maxValue);



    }





}


