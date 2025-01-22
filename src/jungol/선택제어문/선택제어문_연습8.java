package jungol;

import java.util.Scanner;

public class 선택제어문_연습8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("점수를 입력하세요. ");
        int grade = input.nextInt();

        if(100>=grade && grade >=90){
            System.out.println("A");
        }else if(grade >=90){
            System.out.println("B");
        }else if(grade >=80){
            System.out.println("C");
        }else if(grade >= 70){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
}
