package jungol.반복제어문3;

public class 연습3 {
    public static void main(String[] args) {
        for (int i = 0; i <= 2; i++) {
            for (int j = 1; j <= 1 + i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        for (int i = 0; i <= 2; i++) {
            for (int j = 1; j <= 3-i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}