package day9;

public class exampleTest10 {
    public static void callPrint(){
        System.out.println("static 메서드입니다.");
        System.out.println(5+6);
    }
    public static void callPrint(String message){
        System.out.println(message);
    }
    public static void callPrint(int num1, int num2){
        System.out.println(num1+num2);
    }

    public static void main(String[] args) {
        callPrint();
        callPrint("아ㅜㅁ렇게나쓰면");
        callPrint(2,3);
    }
}
