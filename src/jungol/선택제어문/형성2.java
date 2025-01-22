package jungol.선택제어문;

import java.util.Scanner;

public class 형성2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        if(a == 0){
            System.out.println("zero");
        }else if(a>=1){
            System.out.println("plus");
        }else{
            System.out.println("minus");
        }
    }
}
