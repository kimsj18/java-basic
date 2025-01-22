package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a,b;
        a = input.nextInt();
        b = input.nextInt();
        if(a>b){
            System.out.println("입력받은 수 중 큰 수는 "+a+"이고 작은 수는 "+b+"입니다.");
        }else{
            System.out.println("입력받은 수 중 큰 수는 "+b+"이고 작은 수는 "+a+"입니다.");
        }
    }
}
