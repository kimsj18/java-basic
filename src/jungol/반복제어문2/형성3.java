package jungol.반복제어문2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class 형성3 {
    public static void main(String[] args) {


    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int sum = 0;

    for(int i =1;i<=a;i++){
        if(i%5==0){
        sum+=i;
        }
    }
        System.out.println(sum);
}

}