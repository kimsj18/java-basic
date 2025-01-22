package jungol;

import java.util.Scanner;

public class 입력_자가7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        a = input.nextInt();
        b = input.nextInt();
        System.out.printf("%d * %d = %d%n",a,b,a*b);
        System.out.printf("%d / %d = %d ",a,b,a/b);
    }
}
