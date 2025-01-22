package jungol.반복제어문1;

import java.util.Scanner;

public class 형성2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        while (true){
            int a = in.nextInt();
            if(a==0){
                break;
            }else if(a%2==0){
                even++;
            }else if(a%2==1){
                odd++;
            }
        }
        System.out.println("odd : "+odd);
        System.out.println("even : "+even);
    }

}
