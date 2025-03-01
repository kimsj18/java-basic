package day4;

public class LogicalOperatorEx {
    public static void main(String[] args) {
        // 논리연산자 (&& = 논리곱, || = 논리합, ^ = 배타적논리합, ! = not)
        
        int charCode = 'A';  //65 ,  65~90 알파벳 대문자 범위 A~Z
        
        //charCode 변수에 들어있는 값이 대문자인지 소문자인지를 검증하고 싶다.
        if((65 <= charCode) && (charCode <=90)){
            System.out.println("알파벳 대문자 이군요");
        }
        
        //소문자인지 검사 조건식 작성해 보세요. charCode = 'a' //a=97 ~ z=122
        int charCode1 = 'a';
        if((97 <= charCode1) && (charCode1 <= 122)){
            System.out.println("알파벳 소문자 이군요");
        }

        //charCode = 48;
        //charCode 변수의 검증결과 0-9사이의 숫자값이군요 / 출력 0 문자의 아스키코드값 = 48 9는 =>57
        
        charCode = 48;
        if((48 <= charCode) && (charCode <= 57)) {
            System.out.println("0-9사이의 숫자값이군요");
        }
        
        int value = 6;
        // value 변수의 값이 짝수인지 홀수인지 판별하는 구문을 작성하세요.
        if(value %2 == 0){
            System.out.println("짝수");
        }else{
            System.out.println("홀수");
        }
        
        
        // value 변수의 값이 2의 배수이거나 3의 배수인지를 확인하는 구문을 작성하세요.
        if((value %2 == 0) || (value %3 == 0)){
            System.out.println("2 또는 3의 배수이군요");
        }else{
            System.out.println("2또는 3의 배수가 아닌군요");
        }
        
    }
}
