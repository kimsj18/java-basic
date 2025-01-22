package jungol.배열1;

import java.util.Scanner;

public class 연습2  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[] a = new char[26];

        for(int i = 0;i<26;i++){
            a[i] = input.next().charAt(0);
        }
        for(int j =25;j>=0;j--){
            System.out.print(a[j]+" ");
        }
    }
}
