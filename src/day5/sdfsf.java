package day5;

import java.util.Scanner;

public class sdfsf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("점수를 입력하세요.");
        int grade =input.nextInt();

        if( 90 <=grade ){
            if(100 >= grade){
            System.out.println("A 학점");
        }}else if( grade < 90 ){
            System.out.println("B 학점");
        }else if( grade < 80){
            System.out.println("C 학점");
        }else if(grade <70){
            System.out.println("D 학점");
        }else{
            System.out.println("F 학점");
        }


    }
}
