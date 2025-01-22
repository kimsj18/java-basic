package day2;

public class integerLiteralEx {
    public static void main(String[] args) {
        //10진수 11을 이진수로 저장하려고 한다. 어떻게 표현하면 될까?
        // 0b로 시작한다
        int x =0b1011; // 0b1011 = 11
        System.out.println(x);

        // 10진수 11을 8진수로 저장할려고 한다. 어떻게 표현할까
        // 앞에 0으로 시작한다
        int y = 013;
        System.out.println(y);

        // 16진수 0x, 0x로 시작하고 0~9는 숫자 그대로 10~15는 a~f로 표현한다.
        int z = 0xb;
        System.out.println(z);

        /*문제 10진수
       11 >2진수 var1
       134 >8진수 var2
       365 >10진수 var3
       179 >16진수 var4
       리터럴 처리하여 출력은 10진수로
 */
        int var1 = 0b1011;
        System.out.println(var1);

        int var2 = 0206;
        System.out.println(var2);

        int var3 = 365;
        System.out.println(var3);

        int var4 = 0xb3;
        System.out.println(var4);

        int var5 = 0b1011;
        int var6 = 0206;
        int var7 = 365;
        int var8 = 0xb3;


    }
}

