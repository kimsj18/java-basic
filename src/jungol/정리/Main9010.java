package jungol.정리;

public class Main9010 {
    public static void main(String[] args) {
        //switching문제
        int n1, n2, temp;
        n1 = 10;
        n2 = 20;

        temp = n1;  //temp에 n1 넣고
        n1 = n2;  //n1에 n2 넣고
        n2 = temp; //다시 n2에 temp넣고 이 과정이 swap스왑

        System.out.printf("%d %d", n1, n2);
    }
}
