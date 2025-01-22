package jungol.반복제어문2;

import java.util.Scanner;

public class 자가8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for(int i =2;i<=4;i++){          //단 출력 : 2~4단
            for(int j =1;j<=5;j++){
                System.out.printf("%d * %d = %2d ",i,j,i*j);
               }
            System.out.println();
        }
    }
}
