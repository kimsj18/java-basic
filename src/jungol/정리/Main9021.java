package jungol.정리;

public class Main9021 {
    public static void main(String[] args) {
        int a,b;
        a = 10;
        b = 10;

        a = a++;
        b = ++b;
        System.out.println("a++ = ");
        System.out.println(b);

        a=a--;
        b=--b;
        System.out.println(a);
        System.out.println(b);


    }
}
