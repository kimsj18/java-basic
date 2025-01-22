package jungol.반복제어문1;

import java.util.Scanner;

public class 자가6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.println("1. Korea");
            System.out.println("2. USA");
            System.out.println("3. Japan");
            System.out.println("4. China");
            System.out.print("number?");
            int a = in.nextInt();
            System.out.println();

            if(a==1){
                System.out.println("Seoul\n");
            }else if(a==2) {
                System.out.println("Washington\n");
            }else if(a==3){
                System.out.println("Tokyo\n");
            }else if(a==4){
                System.out.println("Beijing\n");
            }else{
                System.out.println("none");
                break;
            }

        }
    }
}
