package jungol.반복제어문2;

import java.util.Scanner;

public class 형성5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int even = 0;
        int odd = 0;

        for(int i=1;i<=10;i++){
            int a = in.nextInt();
            if(a%2==0){
                even++ ;
            }else{
                odd++ ;
            }
        }
        System.out.println("even : "+even);
        System.out.println("odd : "+odd);
    }
}
