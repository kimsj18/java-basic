package day8;
//자바 문자열 자르는 방법 2가지
//1. String 클래스의 split()  java.lang.Sring
//   매개변수(parameter)갯수가 다른 2개로 오버로딩 되어 있다.
//   다형성 : 오버로딩 메서드의 이름이 같으면서 매개변수 타입이나, 매개변수 개수를 달리해서
//2. StringTokenizer 클래스   java.util.StringTokenizer

// [] <= 배열


public class StringSpritEx {
    public static void main(String[] args) {
        String str = "input-github.com@kimsj0118#aaa@bbb";
        String[] splitter = str.split("[%-@#]");    //<<여기서 대괄호는 안에 있는것중 하나있음 잘라라

        System.out.println(splitter[0]);
        System.out.println(splitter[1]);
        System.out.println(splitter[2]);
        System.out.println(splitter[3]);
        System.out.println(splitter[4]);
        System.out.println(splitter[5]);
//        int i=0;
//        for(String data:splitter){
//            System.out.printf("% d 위치 : %s%n",++i,data);
//        }
//
//        for(int index = 0;index<splitter.length;index++){
//            System.out.println(splitter[index]);
//        }




    }
}
