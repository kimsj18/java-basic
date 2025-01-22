package jungol.반복제어문2;

import java.util.Scanner;

public class 형성2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if(a>=b){
            for(int i =b;i<=a;i++){
                System.out.print(i+" ");
            }
        }else if(b>=a){
            for(int j=a;j<=b;j++){
                System.out.print(j+" ");
            }

        }


    }
}
