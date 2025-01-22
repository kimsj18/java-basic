package jungol.반복제어문2;

import java.util.Scanner;

public class 연습5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 0;

        for(int i =1;i<=10;i++){
            int a = in.nextInt();

            if(a%2==0){
                count++ ;

            }
        }
        System.out.println("입력받은 짝수는 "+count+"개입니다.");
    }
}
