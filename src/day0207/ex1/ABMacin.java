package day0207.ex1;

public class ABMacin {
    public static void main(String[] args) {
        //A객체 생성
        A a = new A();
        //B객체 생성
        A.B b = a.new B();
    }
}
