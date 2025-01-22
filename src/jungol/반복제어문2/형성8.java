package jungol.반복제어문2;

import java.util.Scanner;

public class 형성8 {
    public static void main(String[] args) {


    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();

    for(int i =1;i<=a;i++){
        for(int j=1;j<=b;j++){
            System.out.print(i*j+" ");
        }
        System.out.println();
    }
}
}
