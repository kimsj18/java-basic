package jungol.반복제어문2;

public class 자가7질문 {
    public static void main(String[] args) {
        int a=0;
        for(int i=1;i<=5;i++){
            for(int j=2+(a);j<=6+(a);j++){
                System.out.print(j +" ");
            }
            System.out.println();
            a++;
        }
    }
}
