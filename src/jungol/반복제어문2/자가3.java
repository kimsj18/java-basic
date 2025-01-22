package jungol.반복제어문2;

import java.util.Scanner;

public class 자가3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int i = 2;
        while (true){
            System.out.print(i + " ");
            i += 2;

            if(i>a) break;
        }
    }
}
