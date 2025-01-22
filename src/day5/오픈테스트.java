package day5;

import javax.swing.*;

public class 오픈테스트 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A';

        System.out.println(1 + x << 33);
        System.out.println(y >=5 || x < 0 && x> 2);
        System.out.println(y += 10 - x++);
        System.out.println(x+=2);
        System.out.println( !('A' <= c && c <='z'));
        System.out.println('C'-'c');
        System.out.println('5'-'0');
        System.out.println(c+1);
        System.out.println(++c);
        System.out.println(c++);
        System.out.println(c);

        //
        //int numOfApples = 123;
        //int sizeOfBucket = 10;
       // int numOfBucket = if(numOfApples / sizeOfBucket ==0){
        //    System.out.println("필요한 바구니의 수 :"+numOfBucket);
       // }
        //
        //int num1 = -10;
        //String result = (num1 > 0) ? "양수" : ((num1 < 0 ) ? "음수" : "0");
        //System.out.println(result);
                

    }
}
