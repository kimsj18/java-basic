package jungol;

import java.util.Scanner;

public class 선택제어문_연습6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        if(a>b && a>c){
            System.out.println("세 수를 입력하세요. 입력받은 수 중 가장 큰 수는 "+a+"입니다.");
        }else if(b>a && b > c){
            System.out.println("세 수를 입력하세요. 입력받은 수 중 가장 큰 수는 "+b+"입니다.");
        }else{
            System.out.println("세 수를 입력하세요. 입력받은 수 중 가장 큰 수는 "+c+"입니다.");
        }
    }
}
