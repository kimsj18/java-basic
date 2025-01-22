package day3;

public class Main {
    public static void main(String[] args) {

        multi(10,20);
        div(20,10);

    }

   static void adder(int n1,int n2){
        int result = n1 + n2;
        System.out.printf("%d + %d = %d%n",n1,n2,result);
    }

    static void minus(int n1,int n2){
        int result = n1 - n2;
        System.out.printf("%d - %d = %d%n",n1,n2,result);
    }

    static void multi(int n1,int n2){
        int result = n1 * n2;
        System.out.printf("%d * %d = %d%n",n1,n2,result);
    }

    static void div(int n1,int n2){
        int result = n1 / n2;
        System.out.printf("%d / %d = %d%n",n1,n2,result);
    }


}
