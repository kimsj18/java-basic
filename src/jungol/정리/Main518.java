package jungol;

import java.util.Scanner;

public class Main518 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b,c,result;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        result =Integer.sum(Integer.sum(a,b),c);
        System.out.println("sum : "+result);
        result = (a+b+c)/3;
        System.out.println("avg : "+result);
    }
}
