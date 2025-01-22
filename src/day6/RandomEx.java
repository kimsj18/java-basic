package day6;
// Random(난수) : 컴퓨터가 무작위로 발생시킨 수
//자바 : 1. Random 클래스  2. Math.random()   2가지 방법으로 난수를 발생하여 활용
import java.util.Random;

public class RandomEx {
    public static void main(String[] args) {

        Random random = new Random();  // Random클래스를 실체와(instance :메모리 생성) 하였다.
        //0~3까지의 범위의 난수 생성
        int n1= random.nextInt(4);  //4미만의 랜덤 정수를 리턴한다.
        for(int i =1; i<=3;i++){
            int n2 = random.nextInt(10);
            int n3 = random.nextInt(4)+1;   //1~4까지 범위의 수를 발생
            int n4 = random.nextInt(6)+100;    //100~105수를 넣고싶다. 이렇게 원하는 범위를 생성할수 있다.
            System.out.println(n4);
        }
        //int, long, float, double, boolean 타입의 무작위 값 생성
        long l = random.nextLong();
        float f = random.nextFloat();
        double d = random.nextDouble();
        boolean b = random.nextBoolean();
        System.out.println(l+" "+f+" "+d+" "+b);

        //Math.random() 사용하는 법 : 0.0~1.0사이의 난수가 1개 발생
        //0~10 사이의 값
        int n2= (int)(Math.random()*10);
        System.out.println(n2);
        //0~100사이의 값
        int n3= (int)(Math.random()*100);
        System.out.println(n3);
        //1~10사이의 값
        int n4= (int)(Math.random()*10+1);
        System.out.println(n4);
        //10~20사이의 값
        int n5= (int)(Math.random()*10+10);
        System.out.println(n5);
        //1~45 사이의 값
        int n6= (int)(Math.random()*45+1);
        System.out.println(n6);
        //60~-45 난수 생성하는 식
        //int n7 = random.nextInt(max-min+1)+min;
        int n7 = random.nextInt(60-(-45)+1+(-45));
    }
}
