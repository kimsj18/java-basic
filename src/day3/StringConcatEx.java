package day3;

public class StringConcatEx {
    public static void main(String[] args) {

        int result = 10 + 2 + 8;
        System.out.println("result :" + result);

        //결합연산
        String result1 = "10" + 2 + 8;
        System.out.println(result1); //128로 출력 "8"은 문자열이기때문에
        //"10" + 2 + 8 =  1028로 jungol.입력, 문자 다음은 문자로 생각한다.
        // "10" + (2+8); = 가로먼저 더하고 문자만나니 1010으로 출력

        //String result1 = "10" + (2 + 8);
        //System.out.println(result1+10); 은 101010으로 출력
    }
}
