package jungol.반복제어문1;

import java.util.Scanner;

public class 형성4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;

        while(true){
            int a = in.nextInt();
            if(a==0){
                break;
            }if(a%3!=0) {
                if (a % 5 != 0) {
                    count++;
                }
            }

        }
        System.out.println(count);
    }

}
