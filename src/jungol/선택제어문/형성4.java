package jungol.선택제어문;

import java.util.Scanner;

public class 형성4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number? ");
        int a = in.nextInt();

        if(a == 1){
            System.out.println("dog");
        }else if(a == 2){
            System.out.println("cat");
        }else if(a == 3){
            System.out.println("chick");
        }else{
            System.out.println("I don't know.");
        }
    }
}
