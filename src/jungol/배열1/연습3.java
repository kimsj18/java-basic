package jungol.배열1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class 연습3 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int[] a = new int[10];

    for(int i=0; i<10;i++){
        a[i]=input.nextInt();
    }
        System.out.printf("%d %d %d",a[2],a[4],a[9]);

} }

