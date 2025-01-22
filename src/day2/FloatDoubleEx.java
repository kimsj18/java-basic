package day2;

public class FloatDoubleEx {
    public static void main(String[] args) {

        double x = 0.25;
        System.out.println(x);
        double y = - 3.14;   //10진수 리터럴
        System.out.println(y);

        double z = 5e2;     // 5.0 x 10의 제곱 = 500.0
        System.out.println(z);
        double k = 0.12E-2;   // 0.12 x 10의 -2제곱 = 0.0012
        System.out.println(k);
        //자바 컴파일러는 실수 리터럴을 기본적으로 double타입으로 해석하기 때문에 double타입변수에 대입하는 것이 기본이다.

        float o = 3.14F;  //마지막 f는 float값이라는 표시 (double은 기본타입이기에 따로 없음)
        System.out.println(o);
        float v = 3E6f;
        System.out.println(v);


    }
}
