package jungol.반복제어문3;

import java.util.Scanner;

public class 자가1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum = 0;
        int count = 0;

        for(int i  = 1;i<=a;i++){
            if(i%2==1){
                count++ ;
                sum+= i;
            }if(sum>=a){
                break;
            }
        }
        System.out.printf("%d %d",count,sum);
    }
}
