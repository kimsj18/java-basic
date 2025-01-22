package jungol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_자가3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while (true){
            System.out.print("number? ");
            int a1 = input.nextInt();

            if (a1 > 0) {
                System.out.println("positive integer");
            } else if (a1 < 0) {
                System.out.println("negative number");
            } else {
                break;
            }

        }


    }
}